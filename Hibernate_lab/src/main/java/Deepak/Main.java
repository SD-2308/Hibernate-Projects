package Deepak;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Mainapp {

	public static void main(String[] args) {
		Configuration config= new Configuration();
		config.configure("hibernate.cfg.xml");
		config.addAnnotatedClass(Product.class);
		
		
		SessionFactory sf= config.buildSessionFactory();
		Session sess=sf.openSession();
		
		Transaction tx=sess.beginTransaction();
		
		Product p=new Product(1,"Moues",250);
		sess.save(p);
		tx.commit();
		sess.close();

	}

}