package com.edu;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
public class EmployeeProject {
	@Id
	@Column(name="Emp_id")
	private int EmpId;
	
	private String EmpName;
	
	@ManyToMany@JoinTable(name="ProjectAssign", joinColumns = {@JoinColumn(name="Emp_id")}, inverseJoinColumns = {@JoinColumn(name = "Project_id")})
	
	
	private List<Project> project;
	
	
	
	
	public List<Project> getProject() {
		return project;
	}
	public void setProject(List<Project> project) {
		this.project = project;
	}
	public EmployeeProject() {
		super();
		// TODO Auto-generated constructor stub
	}
	public EmployeeProject(int empId, String empName) {
		super();
		EmpId = empId;
		EmpName = empName;
	}
	
	public int getEmpId() {
		return EmpId;
	}
	public void setEmpId(int empId) {
		EmpId = empId;
	}
	public String getEmpName() {
		return EmpName;
	}
	public void setEmpName(String empName) {
		EmpName = empName;
	}
	
	@Override
	public String toString() {
		return "EmployeeProject [EmpId=" + EmpId + ", EmpName=" + EmpName + "]";
	}
	

}
