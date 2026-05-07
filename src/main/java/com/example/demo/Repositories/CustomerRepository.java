package com.example.demo.Repositories;

import com.example.demo.Models.Customer;
import java.util.List;

public interface CustomerRepository {

    List<Customer> findAll();

    Customer findById(int id);

    void save(Customer customer);

    void updateRentalAgreement(int id);
}