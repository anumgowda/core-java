package com.xworkz.cat.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table(name="CAT")
public class Cat {
	@Id
	@Column(name="CAT_ID")
	private int id;
	@Column(name="CAT_NAME")
	private String name;
	@Column(name="CAT_COLOR")
	private String color;
	@Column(name="WEIGHT")
	private double weight;
	public Cat(int id, String name, String color, double weight) {
		super();
		this.id = id;
		this.name = name;
		this.color = color;
		this.weight = weight;
	}
	
	public Cat() {
	
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	@Override
	public String toString() {
		return "Cat [id=" + id + ", name=" + name + ", color=" + color + ", weight=" + weight + "]";
	}
	

}
