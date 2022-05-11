package com.springbootinventorymanagement.demo.models;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "DATE_TABLE")
public class Date {
	
	@Id
	@OneToOne(mappedBy = "Production")
    private Integer dateID;
	
	private  LocalDate date;
	
	private Integer yearNumber;	
	private String quarter;
	private Integer monthNumber;
	private String	monthName;
	private Integer weekNumber;
	private String weekDay;
	private Integer dayOfMonth;


}
