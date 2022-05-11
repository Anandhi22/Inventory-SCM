package com.springbootinventorymanagement.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springbootinventorymanagement.demo.models.Production;

@Repository
public interface ProductionRepository extends JpaRepository<Production, Integer> {


        Production findByProductIdandDateId(Integer ProductId, Integer dateId);
	
}
