package com.springbootinventorymanagement.demo.models;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "PRODUCTION")
public class Production {
	
	@OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "dateId", referencedColumnName = "date_id")
     private Integer  dateID;
	
	@OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "productId", referencedColumnName = "product_id")
     private Integer productID;
	
	private Integer stockEOD;
	
	private Integer deliveryFromProduction;
	
	private Integer rejection;
	
	private Integer startupLoss;
	
	private Integer obsoletes	;
	
	private Integer backorder;
	
	public Integer getDeliveryFromProduction() {
		return deliveryFromProduction;
	}

	public void setDeliveryFromProduction(Integer deliveryFromProduction) {
		this.deliveryFromProduction = deliveryFromProduction;
	}
	


}
