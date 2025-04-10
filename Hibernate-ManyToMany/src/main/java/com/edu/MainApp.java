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
		config.addAnnotatedClass(EmployeeProject.class);
		config.addAnnotatedClass(Project.class);
		
		SessionFactory sf = config.buildSessionFactory();
		Session sess = sf.openSession();
		
		Transaction tx = sess.beginTransaction();
		
		Project p1 = new Project();
		p1.setProjId(11);
		p1.setProjName("Tesla");
		
		Project p2 = new Project();
		p2.setProjId(12);
		p2.setProjName("Google");
			
		List<Project> plist = new ArrayList<Project>();
		plist.add(p1);
		
		List<Project> plist2 = new ArrayList<Project>();
		plist2.add(p2);
		
		EmployeeProject e1 = new EmployeeProject();
		e1.setEmpId(1);
		e1.setEmpName("Deepak");
		e1.setProject(plist);
		
		EmployeeProject e2 = new EmployeeProject();
		e2.setEmpId(2);
		e2.setEmpName("Mohan");
		e2.setProject(plist2);
		
		EmployeeProject e3 = new EmployeeProject();
		e3.setEmpId(3);
		e3.setEmpName("Dinesh");
		e3.setProject(plist);
		
		List<EmployeeProject> elist = new ArrayList<EmployeeProject>();
		elist.add(e1);
		elist.add(e2);
		elist.add(e3);
		
		
		p1.setEmployeeProject(elist);
		e1.setProject(plist);
		
		
		sess.save(p1);
		sess.save(p2);
		sess.save(e1);
		sess.save(e2);
		sess.save(e3);
		
		tx.commit();
		
		sess.close();
	}

}