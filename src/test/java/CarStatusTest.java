package com.example.demo.Models;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CarStatusTest {

    @Test
    void carShouldBecomeUnavailableWhenRentalIsCreated() {
        // Arrange
        Car car = new Car(
                1,
                "AZ131313",
                "VIN113",
                "Toyota",
                "Yaris",
                CarStatus.AVAILABLE,
                500
        );

        // Act
        car.markAsUnavailable();

        // Assert
        assertEquals(CarStatus.UNAVAILABLE, car.getStatus());
    }

    @Test
    void carShouldBecomeAvailableWhenReturnedWithoutDamage() {
        // Arrange
        Car car = new Car(
                1,
                "AZ13131",
                "VIN123",
                "Toyota",
                "Yaris",
                CarStatus.UNAVAILABLE,
                500
        );

        // Act
        car.markAsAvailable();

        // Assert
        assertEquals(CarStatus.AVAILABLE, car.getStatus());
    }

    @Test
    void carShouldBecomeDamagedWhenReturnedWithDamage() {
        // Arrange
        Car car = new Car(
                1,
                "AZ13131",
                "VIN113",
                "Toyota",
                "Yaris",
                CarStatus.UNAVAILABLE,
                500
        );

        // Act
        car.markAsDamaged();

        // Assert
        assertEquals(CarStatus.DAMAGED, car.getStatus());
    }
}