package com.ims.app.controller;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ims.app.model.Product;
import com.ims.app.service.ProductSerivce;


@RestController
public class ProductController {

	@Autowired
	private ProductSerivce productSerivce;

	@GetMapping("/products")
	public List<Product> getAllProducts() {
		return productSerivce.getAllProducts();
	}
}
