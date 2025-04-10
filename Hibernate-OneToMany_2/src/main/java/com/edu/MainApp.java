package com.edu;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MainApp {

	public static void main(String[] args) {
		Configuration config = new Configuration();
		config.configure("hibernate.cfg.xml");
		config.addAnnotatedClass(Question1.class);
		config.addAnnotatedClass(Answer1.class);
		
		SessionFactory sf = config.buildSessionFactory();
		Session sess = sf.openSession();
		
		Transaction tx = sess.beginTransaction();
		
		Question1 q=sess.get(Question1.class,12);
		
//		Question1 q=sess.get(Question1.class,13);
//		Question1 q=sess.load(Question1.class,13);
		
		if(q!= null) {
		System.out.println(q.getQuestion());
		System.out.println(q.getQuestionId());
		}
		else {
			System.out.println("Record Not Found");
		}
//		System.out.println(q.getAnswer1());
		
		
		
		
//		Question1 q=new Question1();
//		q.setQuestionId(12);
//		q.setQuestion("What is Java?");
//		
//		Answer1 a1 = new Answer1();
//		a1.setAnswerId(45);
//		a1.setAnswer("Object Oriented Programming Language");
//		a1.setQuestion1(q);
//		
//		Answer1 a2 = new Answer1();
//		a2.setAnswerId(46);
//		a2.setAnswer("James Ghosling is invented");
//		a2.setQuestion1(q);
//		
//		Answer1 a3 = new Answer1();
//		a3.setAnswerId(47);
//		a3.setAnswer("In year 1994");
//		a3.setQuestion1(q);
//		
//		List<Answer1> alist=new ArrayList<>();
//		alist.add(a1);
//		alist.add(a2);
//		alist.add(a3);
//		
//		q.setAnswer1(alist);
//		sess.save(q);
//		
//
//		sess.save(a1);
//		sess.save(a2);
//		sess.save(a3);
		tx.commit();
		sess.close();
		
		
		sess.close();

	}

}