package com.example.demo.Services;

import com.example.demo.Models.Customer;
import com.example.demo.Repositories.CustomerRepository;
import com.example.demo.Repositories.JDBCCustomerRepository;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class CustomerService {

    private CustomerRepository customerRepository;

    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public List<Customer> getAllCustomers() {
        return customerRepository.findAll();
    }

    public Customer getCustomerById(int id) {
        return customerRepository.findById(id);
    }

    @Transactional
    public void createCustomer(Customer customer) {
        customerRepository.save(customer);
    }

    @Transactional
    public void addCustomer(Customer customer) {
        createCustomer(customer);
    }

    @Transactional
    public void updateCustomer(Customer customer) {
        customerRepository.update(customer);
    }

    @Transactional
    public void deleteCustomerById(int id) {
        customerRepository.deleteById(id);
    }

    @Transactional
    public void updateContactInfo(int id, String email, String phone) {

        Customer customer = customerRepository.findById(id);

        if (customer != null) {
            customer.updateContactInfo(email, phone);
            customerRepository.update(customer);
        }
    }
}
