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
        config.addAnnotatedClass(Product.class);
        config.addAnnotatedClass(Customer.class);
        
        SessionFactory sf = config.buildSessionFactory();
        Session sess = sf.openSession();
        
        Transaction tx = sess.beginTransaction();
        
        
        Product p1 = new Product(11, "Soap");
        Product p2 = new Product(12, "Shampoo");
        
        
        Customer c1 = new Customer(1, "Deepak");
        Customer c2 = new Customer(2, "Dinesh");
        Customer c3 = new Customer(3, "Mohan");
        
        
        List<Product> productList1 = new ArrayList<>();
        productList1.add(p1);
        
        List<Product> productList2 = new ArrayList<>();
        productList2.add(p2);
        
        c1.setProducts(productList1);
        c2.setProducts(productList2);
        c3.setProducts(productList1);
        
        List<Customer> customerList = new ArrayList<>();
        customerList.add(c1);
        customerList.add(c2);
        customerList.add(c3);
        
        p1.setCustomer(customerList);

        
        sess.save(p1);
        sess.save(p2);
        sess.save(c1);
        sess.save(c2);
        sess.save(c3);
        
        tx.commit();
        
        sess.close();  
        sf.close();  

        System.out.println("Data saved successfully!");
    }
}
