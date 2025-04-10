package com.ed;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MainApp {

	private static final boolean True = false;

	public static void main(String[] args) {
		Configuration config=new Configuration();
		config.configure("hibernate.cfg.xml");
		config.addAnnotatedClass(Address.class);
		
		SessionFactory sf=config.buildSessionFactory();
		
		Session ses=sf.openSession();
		Transaction tx=ses.beginTransaction();
		
		//StudentTable s=new StudentTable(3,"Mohan Prakesh","chennai");
		StudentTable s=new StudentTable();
        s.setScity("Chennai");
        s.setSname("Aravind");
        s.setScity("Hydrabad");
        s.setSname("Elavalazan");
		
		ses.save(s);
		
		Address ad = new Address();
		ad.setAddedDate(new Date());
		ad.setCity("chennai");
		ad.setOpen(True);
		ad.setStreet("1st Street");
		ses.save(ad);
		
		
		tx.commit();
		
		
		ses.close();
		
		
	}

}