package com.ims.app.service;

import java.util.*;

import org.springframework.stereotype.Service;

import com.ims.app.model.Product;

@Service
public class ProductSerivce {
    
    private List<Product> products = new ArrayList<>(Arrays.asList(
			new Product("1", "Soda", 2.25, "Soda Pop", 2),
			new Product("2", "Red Bull", 3.25, "Energy Drink", 5),
			new Product("3", "Water", 1.00, "Purified Water", 24)
		));

    // READ operation
    public List<Product> getAllProducts(){
        return products;
    }

    // READ operation by id
    public Product getProduct(String id){
        return products.stream().filter(product -> product.getId().equals(id)).findFirst().get();
    }

    // POST operation
    public void addProduct(Product product) {
        products.add(product);
    }

    // UPDATE operation
    public void updateProduct(String id, Product product) {
        for(int i = 0; i < products.size(); i++){
            Product p = products.get(i);
            if(p.getId().equals(id)){
                products.set(i, product);
                return;
            }
        }
    }

    // DELETE operation
    public void deleteProduct(String id) {
        products.removeIf(product -> product.getId().equals(id));
    }
}
