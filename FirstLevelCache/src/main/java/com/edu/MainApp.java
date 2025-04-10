package com.edu;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MainApp {

	public static void main(String[] args) {
		
		Configuration config=new Configuration();
        config.configure("hibernate.cfg.xml");
       config.addAnnotatedClass(Student1.class);
        
        SessionFactory sf=config.buildSessionFactory();
        Session sess=sf.openSession();
        Transaction tx = sess.beginTransaction();
        Student1 s=sess.get(Student1.class, 1);
        System.out.println(s);
        
        Student1 s1 = sess.get(Student1.class,2);
        
        System.out.println(s1);
        
        
        
        tx.commit();
        sess.close();
        
        Session sess2=sf.openSession();
        Student1 s2=sess2.get(Student1.class, 1);
        System.out.println(s2);
	}

}
