package com.springbootinventorymanagement.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springbootinventorymanagement.demo.models.Production;
import com.springbootinventorymanagement.demo.service.ProductionService;


@RestController
@RequestMapping("/production")
public class ProductionController {
	
	@Autowired
	private ProductionService productionService;
	
	@PostMapping("/{productId}/{dateId}")
	public Production findProductbyId(@PathVariable Integer productId,@PathVariable Integer dateId)
	{
		return  productionService.getbyProductIdandDateId(productId, dateId);
	}
	
	@PostMapping("/{productId}")
	public Integer findProductbyId(@PathVariable Integer productId)
	{
		return productionService.getProductbyId(productId);
	}
	
}
