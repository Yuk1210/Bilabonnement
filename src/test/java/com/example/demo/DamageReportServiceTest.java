package com.example.demo;

import com.example.demo.Models.DamageLine;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DamageReportServiceTest {

    @Test
    void shouldReturnTotalPriceForOneDamage() {
        // Arrange
        List<DamageLine> damageLines = List.of(
                new DamageLine(1, "Scratch on door", 1500.00)
        );
        double expectedTotalPrice = 1500.00;

        DamageReportService damageReportService = new DamageReportService();

        // Act
        double actualTotalPrice = damageReportService.calculateTotalDamagePrice(damageLines);

        // Assert
        assertEquals(expectedTotalPrice, actualTotalPrice);
    }

    @Test
    void shouldReturnSumOfMultipleDamageLines() {
        // Arrange
        List<DamageLine> damageLines = List.of(
                new DamageLine(1, "Scratch on door", 1500.00),
                new DamageLine(2, "Broken mirror", 2000.00),
                new DamageLine(3, "Dent in bumper", 500.00)
        );
        double expectedTotalPrice = 4000.00;

        DamageReportService damageReportService = new DamageReportService();

        // Act
        double actualTotalPrice = damageReportService.calculateTotalDamagePrice(damageLines);

        // Assert
        assertEquals(expectedTotalPrice, actualTotalPrice);
    }

    @Test
    void shouldReturnZeroWhenNoDamageLinesExist() {
        // Arrange
        List<DamageLine> damageLines = List.of();
        double expectedTotalPrice = 0.00;

        DamageReportService damageReportService = new DamageReportService();

        // Act
        double actualTotalPrice = damageReportService.calculateTotalDamagePrice(damageLines);

        // Assert
        assertEquals(expectedTotalPrice, actualTotalPrice);
    }
}
