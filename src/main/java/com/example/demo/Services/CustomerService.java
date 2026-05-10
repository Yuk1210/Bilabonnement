package com.example.demo.Services;

import com.example.demo.Models.Customer;
import com.example.demo.Repositories.CustomerRepository;
import com.example.demo.Repositories.JDBCCustomerRepository;

import java.util.List;

public class CustomerService {

    private CustomerRepository customerRepository;

    public CustomerService() {
        this.customerRepository = new JDBCCustomerRepository();
    }

    public List<Customer> getAllCustomers() {
        return customerRepository.findAll();
    }

    public Customer getCustomerById(int id) {
        return customerRepository.findById(id);
    }

    public void createCustomer(Customer customer) {
        customerRepository.save(customer);
    }

    public void updateCustomer(Customer customer) {
        customerRepository.update(customer);
    }

    public void deleteCustomerById(int id) {
        customerRepository.deleteById(id);
    }

    public void updateContactInfo(int id, String email, String phone) {
        Customer customer = customerRepository.findById(id);

        if (customer != null) {
            customer.updateContactInfo(email, phone);
            customerRepository.update(customer);
        }
    }
}