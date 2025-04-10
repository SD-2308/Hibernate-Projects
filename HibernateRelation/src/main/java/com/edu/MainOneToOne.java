package com.edu;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class MainOneToOne {

	public static void main(String[] args) {
		
		Configuration config=new Configuration();
		config.configure("hibernate.cfg.xml");
		config.addAnnotatedClass(Question.class);
		config.addAnnotatedClass(Answer.class);
		
		SessionFactory sf=config.buildSessionFactory();
		
		Session ses=sf.openSession();

		Transaction tx=ses.beginTransaction();
		
		Question q = new Question();
		q.setQuestionid(12);
		q.setQuestion("What is Java?");
		
		Answer a = new Answer();
		a.setAnswerid(45);
		a.setAnswer("Object Oriented Programing Language");
		
		q.setAnswer(a);
		
		ses.save(a);
		ses.save(q);
		tx.commit();
		
		ses.close();
		
	}

}
