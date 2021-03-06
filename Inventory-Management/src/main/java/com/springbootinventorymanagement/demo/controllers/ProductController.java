package com.springbootinventorymanagement.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springbootinventorymanagement.demo.models.Product;
import com.springbootinventorymanagement.demo.service.ProductService;

@RestController
@RequestMapping("/product")
public class ProductController {


	 @Autowired
	 private ProductService service;
	 
	@GetMapping("/all")
    public List<Product> getAllProducts() {
        return service.getAllProduts();
    }

}
