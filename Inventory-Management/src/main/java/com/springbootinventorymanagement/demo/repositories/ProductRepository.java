package com.springbootinventorymanagement.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springbootinventorymanagement.demo.models.Product;



public interface ProductRepository extends JpaRepository<Product, Integer> {
	
	

}
