package com.ims.app.controller;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ims.app.model.Customer;
import com.ims.app.service.CustomerService;

@RestController
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    // Get 
    @GetMapping("/customers")
    public List<Customer> getAllCustomers() {
        return customerService.getAllCustomers();
    }


    // POST 
    @PostMapping("/customers")
    public void createCustomer(@RequestBody Customer customer){
        customerService.createCustomer(customer);
    }

    // DELETE 
    @DeleteMapping("/customer/{id}")
    public void deleteCustomer(@PathVariable Long id){
        customerService.deleteCustomer(id);
    }
}
