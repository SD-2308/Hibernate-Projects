package com.edu;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Department {

 @Id
 @GeneratedValue(strategy = GenerationType.IDENTITY)
 private int departmentId;

 private String departmentName;
 private String departmentLocation;

 @OneToMany(mappedBy = "department", cascade = CascadeType.ALL, orphanRemoval = true)
 private List<Employee> employees = new ArrayList<>();

 // Getters and Setters
 public int getDepartmentId() {
     return departmentId;
 }

 public void setDepartmentId(int departmentId) {
     this.departmentId = departmentId;
 }

 public String getDepartmentName() {
     return departmentName;
 }

 public void setDepartmentName(String departmentName) {
     this.departmentName = departmentName;
 }

 public String getDepartmentLocation() {
     return departmentLocation;
 }

 public void setDepartmentLocation(String departmentLocation) {
     this.departmentLocation = departmentLocation;
 }

 public List<Employee> getEmployees() {
     return employees;
 }

 public void setEmployees(List<Employee> employees) {
     this.employees = employees;
 }

 public void addEmployee(Employee employee) {
     employees.add(employee);
     employee.setDepartment(this);
 }

 public void removeEmployee(Employee employee) {
     employees.remove(employee);
     employee.setDepartment(null);
 }
}