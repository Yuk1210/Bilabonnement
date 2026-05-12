package com.example.demo.Services;

import com.example.demo.Models.RentalAgreement;
import com.example.demo.Repositories.JdbcRentalAgreementRepository;
import com.example.demo.Repositories.RentalAgreementRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RentalAgreementService {

    private final RentalAgreementRepository rentalAgreementRepository;

    public RentalAgreementService() {
        this.rentalAgreementRepository = new JdbcRentalAgreementRepository();
    }

    public List<RentalAgreement> getAllAgreements() {
        return rentalAgreementRepository.findAll();
    }

    public void addAgreement(RentalAgreement rentalAgreement) {
        rentalAgreementRepository.save(rentalAgreement);
    }
}
