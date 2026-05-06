package com.example.demo.Models;

import java.time.LocalDate;

public class RentalAgreement {
    private int id;
    private LocalDate startDate;
    private LocalDate endDate;
    private double totalPrice;
    private String pickupLocation;
    private String returnLocation;

    public RentalAgreement(int id, LocalDate startDate, LocalDate endDate, double totalPrice, String pickupLocation, String returnLocation)
    {
        this.id = id;
        this.startDate = startDate;
        this.endDate = endDate;
        this.totalPrice = totalPrice;
        this.pickupLocation = pickupLocation;
        this.returnLocation = returnLocation;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public String getPickupLocation() {
        return pickupLocation;
    }

    public void setPickupLocation(String pickupLocation) {
        this.pickupLocation = pickupLocation;
    }

    public String getReturnLocation() {
        return returnLocation;
    }

    public void setReturnLocation(String returnLocation) {
        this.returnLocation = returnLocation;
    }
}