package com.xworkz.clothes.entity;



import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="clothes")

public class Clothes {
	private int id;
	private String brand;
	private double prize;
	@Column(name="date")
	private Date manufacturedDate;
	
	
	

}
