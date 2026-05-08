package com.example.demo.Repositories;

import com.example.demo.Models.RentalAgreement;

import java.util.List;

public interface RentalAgreementRepository {

    List<RentalAgreement> findAll();
    RentalAgreement findById(int id);
    void save(RentalAgreement rentalAgreement);
    void update(RentalAgreement rentalAgreement);
    void deleteById(int id);

}

