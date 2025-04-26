package com.ims.app.service;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ims.app.model.Product;
import com.ims.app.repository.ProductRepository;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    // READ ALL operation
    public List<Product> getAllProducts(){
        List<Product> products = new ArrayList<>();
        productRepository.findAll().forEach(products::add);
        return products;
    }

    // READ operation by id
    public Product getProduct(String id){
        return productRepository.findById(id).get();
    }

    // POST operation
    public void addProduct(Product product) {
        productRepository.save(product);
    }

    // UPDATE operation
    public void updateProduct(String id, Product product) {
        productRepository.deleteById(id);
        productRepository.save(product);
    }

    // DELETE operation
    public void deleteProduct(String id) {
        productRepository.deleteById(id);
    }
}
