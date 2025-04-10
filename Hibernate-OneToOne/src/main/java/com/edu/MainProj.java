package com.edu;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MainProj {

	public static void main(String[] args) {
		Configuration config = new Configuration();
		config.configure("hibernate.cfg.xml");
		config.addAnnotatedClass(Students.class);
		config.addAnnotatedClass(Laptop.class);
		
		SessionFactory sf = config.buildSessionFactory();
		Session session = sf.openSession();
		
		Transaction tx = session.beginTransaction();
		
		Students s = new Students();
		s.setStudentId(10);
		s.setStudentName("Deepak");
		
		Laptop l = new Laptop();
		l.setLaptopId(101);
		l.setLaptopName("HP");
		
		s.setLaptop(l);
		l.setStudents(s);
		
		session.save(l);
		session.save(s);
		tx.commit();
		
		session.close();

	}

}
