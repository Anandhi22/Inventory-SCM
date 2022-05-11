package com.springbootinventorymanagement.demo.service;


import java.util.List;

import com.springbootinventorymanagement.demo.models.Product;
import com.springbootinventorymanagement.demo.repositories.ProductRepository;

public class ProductService {
	
	private ProductRepository repository;

	public List<Product> getAllProduts() {
		// TODO Auto-generated method stub
		return repository.findAll() ;
	}
	

}
