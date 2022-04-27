package com.xworkz.hibernatedemo.Entity;

import jakarta.persistence.Column;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "restorent")

public class RestorentEntity {
	@Id
	@Column(name = "id")
	private int restorentId;
	private long contactNo;
	private String name;
	private double rating;
	private String location;
	private String type;

}
