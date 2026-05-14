package com.example.demo.Models;

public class DamageLine {

    private int id;
    private String description;
    private double price;

    public DamageLine(int id, String description, double price) {
        this.id = id;
        this.description = description;
        this.price = price;
    }

    public void updateDamage(String description, double price) {
        this.description = description;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public double getPrice() {
        return price;
    }
}