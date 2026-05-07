package com.example.demo.Models;

import java.math.BigDecimal;

public class Car {
    private int id;
    private String vehicleNumber;
    private String vin;
    private String brand;
    private String model;
    private CarStatus status;
    private BigDecimal basePrice;

    public Car(int id, String vehicleNumber, String vin, String brand, String model, CarStatus status, BigDecimal basePrice) {
        this.id = id;
        this.vehicleNumber = vehicleNumber;
        this.vin = vin;
        this.brand = brand;
        this.model = model;
        this.status = status;
        this.basePrice = basePrice;
    }

    public int getId() {
        return id;
    }

    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public String getVin() {
        return vin;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public CarStatus getStatus() {
        return status;
    }

    public void markAsAvailable() {
        this.status = CarStatus.AVAILABLE;
    }

    public void markAsUnavailable() {
        this.status = CarStatus.UNAVAILABLE;
    }

    public void markAsReturned() {
        this.status = CarStatus.RETURNED;
    }

    public void markAsDamaged() {
        this.status = CarStatus.DAMAGED;
    }

    public void markAsUnderRepair() {
        this.status = CarStatus.UNDER_REPAIR;
    }

    public BigDecimal getBasePrice() {
        return basePrice;
    }
}
