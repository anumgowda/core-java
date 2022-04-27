package com.xworkz.hibernate.restorentJPADAO;

import com.xworkz.hibernatedemo.Entity.RestorentEntity;


import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class RestorentJPADAO {
	public void saveRestorent(RestorentEntity entity) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("jpa");
		EntityManager em=emf.createEntityManager();
		em.getTransaction().begin();
		em.persist(entity);
		em.getTransaction().commit();
		em.close();
		emf.close();
		

	}

}
