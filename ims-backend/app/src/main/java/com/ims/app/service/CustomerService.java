package com.ims.app.service;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ims.app.model.Customer;
import com.ims.app.repository.CustomerRepository;

@Service
public class CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    // READ 
    public List<Customer> getAllCustomers() {
        List<Customer> customers = new ArrayList<>(); 
        customerRepository.findAll().forEach(customers::add);
        return customers;
    }

    // POST 
    public void createCustomer(Customer customer){
        customerRepository.save(customer);
    }

    // DELETE 
    public void deleteCustomer(Long Id){
        customerRepository.deleteById(Id);
    }
}
