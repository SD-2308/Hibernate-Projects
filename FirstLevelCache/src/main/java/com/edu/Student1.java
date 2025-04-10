package com.edu;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Student1")
public class Student1 {
	
	@Id // primary key
	@GeneratedValue(strategy = GenerationType.IDENTITY) // auto_increment
	@Column(name = "stdid")
	private int stdid;
	@Column(name = "std_name", length = 50, nullable = false)
	private String Std_name;
	public Student1() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student1(int stdid, String std_name) {
		super();
		this.stdid = stdid;
		Std_name = std_name;
	}
	public int getStdid() {
		return stdid;
	}
	public void setStdid(int stdid) {
		this.stdid = stdid;
	}
	public String getStd_name() {
		return Std_name;
	}
	public void setStd_name(String std_name) {
		Std_name = std_name;
	}
	@Override
	public String toString() {
		return "Student1 [stdid=" + stdid + ", Std_name=" + Std_name + "]";
	}
	
	
	
	
	

}
