package com.ims.app.repository;

import org.springframework.data.repository.CrudRepository;

import com.ims.app.model.Customer;

public interface CustomerRepository extends CrudRepository<Customer, Long>{
  
} 
