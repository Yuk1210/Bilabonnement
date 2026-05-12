package com.example.demo;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

class RentalAgreementValidationTest {

    @Test
    void shouldAcceptValidStartAndEndDate() {
        // Arrange
        LocalDate startDate = LocalDate.now();
        LocalDate endDate = startDate.plusDays(7);

        // Udfyld her: Opret den klasse eller service, som validerer lejeaftalens datoer.
        // Eksempel: RentalAgreement rentalAgreement = new RentalAgreement(startDate, endDate);

        // Act
        // Udfyld her: Kald den metode, som validerer datoerne.
        // Eksempel: boolean isValid = rentalAgreement.hasValidDates();

        // Assert
        // Udfyld her: assertTrue(isValid);
    }

    @Test
    void shouldRejectNullStartDate() {
        // Arrange
        LocalDate startDate = null;
        LocalDate endDate = LocalDate.now().plusDays(7);

        // Udfyld her: Opret den klasse eller service, som validerer lejeaftalens datoer.
        // Eksempel: RentalAgreement rentalAgreement = new RentalAgreement(startDate, endDate);

        // Act
        // Udfyld her: Kald den metode, som validerer datoerne.
        // Hvis jeres løsning kaster exception, så brug assertThrows i stedet.

        // Assert
        // Udfyld her: assertFalse(...) eller assertThrows(...), afhængigt af jeres løsning.
    }

    @Test
    void shouldRejectEndDateBeforeStartDate() {
        // Arrange
        LocalDate startDate = LocalDate.now();
        LocalDate endDate = startDate.minusDays(1);

        // Udfyld her: Opret den klasse eller service, som validerer lejeaftalens datoer.
        // Eksempel: RentalAgreement rentalAgreement = new RentalAgreement(startDate, endDate);

        // Act
        // Udfyld her: Kald den metode, som validerer datoerne.
        // Hvis jeres løsning kaster exception, så brug assertThrows i stedet.

        // Assert
        // Udfyld her: assertFalse(...) eller assertThrows(...), afhængigt af jeres løsning.
    }
}
