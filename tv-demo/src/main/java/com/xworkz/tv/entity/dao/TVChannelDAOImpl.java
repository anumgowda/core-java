package com.xworkz.tv.entity.dao;

import com.xworkz.tv.entity.TVChannel;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class TVChannelDAOImpl implements TVChannelDAO {

	@Override
	public void saveChannel(TVChannel tvChannel) {
		EntityManagerFactory emf=null;
		EntityManager em=null;
		EntityTransaction et=null;
		try {
			emf=Persistence.createEntityManagerFactory(("tv"));
			em=emf.createEntityManager();
			et=em.getTransaction();
			et.begin();
			em.persist(tvChannel);
			et.commit();
			
		}
		catch(Exception e) {
			et.rollback();
			e.printStackTrace();
		}finally {
		
					if(em!=null) {
						em.close();
						
					}
			}
	}
		@Override
		public void getChannel() {
			EntityManagerFactory emf1=null;
			EntityManager em1=null;
			EntityTransaction et1=null;
			try {
				emf1=Persistence.createEntityManagerFactory(("tv"));
				em1=emf1.createEntityManager();
				et1=em1.getTransaction();
				et1.begin();
				TVChannel channel=em1.find(TVChannel.class,2);
				System.out.println(channel.toString());
				et1.commit();
				
				
				
			}
			catch(Exception e) {
				et1.rollback();
				e.printStackTrace();
			}finally {
			
						if(em1!=null) {
							em1.close();
							
						}
				}
				
		}
	}


