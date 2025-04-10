package com.edu;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Project {
	@Id
	@Column(name="Project_id")
	private int ProjId;
	private String ProjName;
	
	@ManyToMany(mappedBy = "project")
	private List<EmployeeProject> employeeProject;
	
	
	public List<EmployeeProject> getEmployeeProject() {
		return employeeProject;
	}
	public void setEmployeeProject(List<EmployeeProject> employeeProject) {
		this.employeeProject = employeeProject;
	}
	public Project() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Project(int projId, String projName) {
		super();
		ProjId = projId;
		ProjName = projName;
	}
	public int getProjId() {
		return ProjId;
	}
	public void setProjId(int projId) {
		ProjId = projId;
	}
	public String getProjName() {
		return ProjName;
	}
	public void setProjName(String projName) {
		ProjName = projName;
	}
	@Override
	public String toString() {
		return "Project [ProjId=" + ProjId + ", ProjName=" + ProjName + "]";
	}
	
	

}
