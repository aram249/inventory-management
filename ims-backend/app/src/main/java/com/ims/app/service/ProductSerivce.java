package com.ims.app.service;

import java.util.*;

import org.springframework.stereotype.Service;

import com.ims.app.model.Product;

@Service
public class ProductSerivce {
    
    private List<Product> products = Arrays.asList(
			new Product("1", "Soda", 2.25, "Soda Pop", 2),
			new Product("2", "Red Bull", 3.25, "Energy Drink", 5),
			new Product("3", "Water", 1.00, "Purified Water", 24)
		);

    public List<Product> getAllProducts(){
        return products;
    }
}
