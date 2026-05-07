package com.example.demo.Repositories;

import com.example.demo.Models.Car;
import com.example.demo.Models.CarStatus;

import java.util.List;

public interface CarRepository {

    List<Car> findAll();
    Car findById(int id);
    void save(Car car);

    void updateStatus(int carId, CarStatus status);
}
