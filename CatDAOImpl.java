package com.xworkz.cat.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.xworkz.cat.entity.Cat;

public class CatDAOImpl implements CatDAO {

	@Override
	public void catSaveOperation() {
		Configuration con=new Configuration();
		con.configure("cat-cfg.xml");
		con.addAnnotatedClass(Cat.class);
		SessionFactory sf=con.buildSessionFactory();
		Session sess=sf.openSession();
		//Cat cat=new Cat(1, "laxi", "white", 3.1);
		Cat cat=new Cat(2, "kookie", "black", 1.1);
		System.out.println("records are inserted");
		Transaction trans=sess.beginTransaction();
		sess.save(cat);
		trans.commit();
		sf.close();
		
		
	}

	@Override
	public void CatReadOperation() {
		Cat cat=new Cat();
		Configuration con=new Configuration();
		con.configure("cat-cfg.xml");
		con.addAnnotatedClass(Cat.class);
		SessionFactory sf=con.buildSessionFactory();
		Session sess=sf.openSession();
		Transaction trans=sess.beginTransaction();
		 Cat Cat=sess.get(Cat.class, 2);
		System.out.println("cat" + Cat);
		
		trans.commit();
		sf.close();
		
		
	}

}
