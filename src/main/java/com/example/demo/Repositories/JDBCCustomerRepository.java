package com.example.demo.Repositories;

import com.example.demo.Models.Customer;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class JDBCCustomerRepository implements CustomerRepository {

    String url = System.getenv("DB_URL");
    String user = System.getenv("DB_USER");
    String password = System.getenv("DB_PASSWORD");

    @Override
    public List<Customer> findAll() {
        List<Customer> customers = new ArrayList<>();
        String sql = "SELECT * FROM customer";

        try (Connection connection = DriverManager.getConnection(url, user, password)) {

            PreparedStatement statement = connection.prepareStatement(sql);
            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()) {
                Customer customer = new Customer(
                        resultSet.getInt("customer_id"),
                        resultSet.getString("name"),
                        resultSet.getString("email"),
                        resultSet.getString("phone")
                );

                customers.add(customer);
            }

        } catch (SQLException e) {
            System.out.println("Der er fejl i: " + e.getMessage());
        }

        return customers;
    }

    @Override
    public Customer findById(int id) {
        return null;
    }

    @Override
    public void save(Customer customer) {

    }

    @Override
    public void updateRentalAgreement(int id) {

    }
}