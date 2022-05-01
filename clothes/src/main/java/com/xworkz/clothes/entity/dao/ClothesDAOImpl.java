package com.xworkz.clothes.entity.dao;

import java.util.Date;


import com.xworkz.clothes.entity.Clothes;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class ClothesDAOImpl implements  ClothesDAO {
EntityManagerFactory factory=Persistence.createEntityManagerFactory("Clothes");
EntityManager manager=null;
EntityTransaction tx=null;
Clothes clothes;
Date date;

@Override
public  void insertCloth(Clothes clothes) {
	try {
		//factory=Persistence.createEntityManagerFactory("clothes");
	manager=factory.createEntityManager();
	tx=manager.getTransaction();
	tx.begin();
	manager.persist(clothes);
	tx.commit();
	}catch(Exception e) {
		tx.rollback();
		e.printStackTrace();
	}finally {
		if(manager!=null) {
			manager.close();
		}
	}
}

@Override
public Clothes getClothesById(Integer clothId) {
	// TODO Auto-generated method stub
	manager =factory.createEntityManager();
Clothes	clothes=manager.find(Clothes.class, clothId);
if(clothes !=null) {
	System.out.println(clothes.toString());
	
}else {
	System.out.println("record not found");
}
	
	return clothes;
}

@Override
public void updateClothBrandAndPriceById(String brand, Double price, Integer Id) {
	// TODO Auto-generated method stub
	try {
		manager=factory.createEntityManager();
		clothes=manager.find(Clothes.class, price);
		if(clothes!=null) {
			tx=manager.getTransaction();
			tx.begin();
			clothes.setBrand(brand);
			clothes.setPrize(price);
			manager.merge(clothes);
			tx.commit();
		}
	}catch (Exception e) {
		// TODO: handle exception
		tx.rollback();
		e.printStackTrace();
	}finally {
		if(manager!=null)
			manager.close();
	}
}

@Override
public void deleteById(Integer Id) {
	// TODO Auto-generated method stub
	try {
		manager=factory.createEntityManager();
		clothes=manager.find(Clothes.class, Id);
		if(clothes!=null) {
			tx=manager.getTransaction();
			tx.begin();
			manager.remove(clothes);
			tx.commit();
		}else {
			System.out.println("records not found");
		}
		
	}catch(Exception e) {
		tx.rollback();
		e.printStackTrace();
	}finally {
		if(manager!=null) {
			manager.close();
		}
	}
}


}
