package com.example.demo.Repositories;

import com.example.demo.Models.Car;
import com.example.demo.Models.CarStatus;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class JdbcCarRepository implements CarRepository {

    String url = System.getenv("DB_URL");
    String user = System.getenv("DB_USER");
    String password = System.getenv("DB_PASSWORD");


    @Override
    public List<Car> findAll() {
        List<Car> cars = new ArrayList<>();
       String sql = "SELECT * FROM car";

       try(Connection connection = DriverManager.getConnection(url,user,password)){
           PreparedStatement statement = connection.prepareStatement(sql);
           ResultSet resultSet = statement.executeQuery();

           while (resultSet.next()){
               Car car = new Car(resultSet.getInt("car_id"),
                       resultSet.getString("vin"),
                       resultSet.getString("brand"),
                       resultSet.getString("model"),
                       CarStatus.valueOf(resultSet.getString("status")),
                       resultSet.getBigDecimal("purchase_price")
               );

               cars.add(car);
           }
       }
       catch (SQLException e){
           System.out.println("fejl: "+ e.getMessage());
       }
       return cars;
    }
    @Override
    public Car findById(int id){
        String sql = "SELECT * FROM car WHERE car_id = ?";

        try(Connection connection = DriverManager.getConnection(url,user,password)){
            PreparedStatement statement = connection.prepareStatement(sql);

            statement.setInt(1,id);

            ResultSet resultSet = statement.executeQuery();

            if(resultSet.next()){
                return new Car(
                        resultSet.getInt("id"),
                        resultSet.getString("vin"),
                        resultSet.getString("brand"),
                        resultSet.getString("model"),
                        CarStatus.valueOf(resultSet.getString("status")),
                        resultSet.getBigDecimal("purchase_price")
                );
            }



    }

}
