package com.ims.app.repository;

import org.springframework.data.repository.CrudRepository;

import com.ims.app.model.Product;

public interface ProductRepository extends CrudRepository<Product, String>{
    
}
