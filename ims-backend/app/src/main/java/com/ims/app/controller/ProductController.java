package com.ims.app.controller;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ims.app.model.Product;
import com.ims.app.service.ProductService;


@RestController
public class ProductController {

	@Autowired
	private ProductService ProductService;

	// READ ALL request
	@GetMapping("/products")
	public List<Product> getAllProducts() {
		return ProductService.getAllProducts();
	}

	// READ request by id
	@GetMapping("/products/{id}") 
	public Product getProduct(@PathVariable String id) {
		return ProductService.getProduct(id);
	}

	// POST request
	@PostMapping("/products")
	public void addProduct(@RequestBody Product product) {
		ProductService.addProduct(product);
	}

	// UPDATE request
	@PutMapping("/products/{id}")
	public void updateProduct(@RequestBody Product product, @PathVariable String id) {
		ProductService.updateProduct(id, product);
	}

	// DELETE request
	@DeleteMapping("/products/{id}") 
	public void deleteProduct(@PathVariable String id) {
		ProductService.deleteProduct(id);
	}
}
