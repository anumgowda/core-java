package com.xworkz.hibernate.runner;

import com.xworkz.hibernate.restorentJPADAO.RestorentJPADAO;

import com.xworkz.hibernatedemo.Entity.RestorentEntity;

public class RunnerClass {
	public static void main(String[] args) {
		RestorentEntity restorentEntity=new RestorentEntity();
		
		restorentEntity.setRestorentId(1);
		restorentEntity.setName("ABC");
		restorentEntity.setContactNo(66878775);
		restorentEntity.setRating(3.8);
		restorentEntity.setLocation("manglore");
		restorentEntity.setType("non-veg");
		RestorentJPADAO restorentJPADAO=new RestorentJPADAO();
		
		restorentJPADAO.saveRestorent(restorentEntity);
		System.out.println("save successfull");
		
	}

}
