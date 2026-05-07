package com.example.demo.Repositories;

import com.example.demo.Models.Customer;


public interface CustomerRepository {

    List<Customer> findAll();
    Customer findById(int id);
    void save(Customer costumer);

    void updateRentalAgreement(int id);



}
