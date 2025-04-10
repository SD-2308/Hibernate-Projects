package com.edu;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import java.util.ArrayList;
import java.util.List;

public class MainProj {
    public static void main(String[] args) {
        Configuration config = new Configuration();
        config.configure("hibernate.cfg.xml");
        config.addAnnotatedClass(Department.class);
        config.addAnnotatedClass(Employee.class);

        SessionFactory sf = config.buildSessionFactory();
        Session session = sf.openSession();

        Transaction tx = session.beginTransaction();

        Department dept1 = new Department();
        dept1.setDepartmentName("IT");
        dept1.setDepartmentLocation("New York");

        List<Employee> employeeList1 = new ArrayList<>();

        Employee emp1 = new Employee();
        emp1.setEmployeeName("Dinesh");
        emp1.setEmployeeAge(30);
        emp1.setDepartment(dept1);

        Employee emp2 = new Employee();
        emp2.setEmployeeName("Deepak");
        emp2.setEmployeeAge(28);
        emp2.setDepartment(dept1);

        employeeList1.add(emp1);
        employeeList1.add(emp2);
        dept1.setEmployees(employeeList1);

        Department dept2 = new Department();
        dept2.setDepartmentName("HR");
        dept2.setDepartmentLocation("Los Angeles");

        List<Employee> employeeList2 = new ArrayList<>();

        Employee emp3 = new Employee();
        emp3.setEmployeeName("Rajesh");
        emp3.setEmployeeAge(35);
        emp3.setDepartment(dept2);

        Employee emp4 = new Employee();
        emp4.setEmployeeName("Amit");
        emp4.setEmployeeAge(32);
        emp4.setDepartment(dept2);

        employeeList2.add(emp3);
        employeeList2.add(emp4);
        dept2.setEmployees(employeeList2);

        session.save(dept1);
        session.save(dept2);

        tx.commit();

        session.close();
        sf.close();
    }
}
