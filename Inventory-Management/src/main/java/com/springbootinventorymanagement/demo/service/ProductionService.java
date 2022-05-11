package com.springbootinventorymanagement.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springbootinventorymanagement.demo.models.Production;
import com.springbootinventorymanagement.demo.repositories.ProductionRepository;

@Service
public class ProductionService {

	@Autowired
	private ProductionRepository repository;

	public Integer getProductbyId(Integer productId) {

		Production productionData = repository.getById(productId);

		return productionData.getDeliveryFromProduction();
	}

	

	public Production getbyProductIdandDateId(Integer productId, Integer dateId) {
		// TODO Auto-generated method stub
		return repository.findByProductIdandDateId(productId, dateId);
	}

}
