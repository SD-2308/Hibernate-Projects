package com.ed;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;



//generate constructor from super class

//generate constructor with argument
//generate setter and getter method
//generate toString

//right click inside class->source->generate 

@Entity
@Table(name = "Student1")
public class StudentTable {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int sid;
	private String sname;
	private String scity;

	public StudentTable() {
		super();
//TODO Auto-generated constructor stub
	}

	public StudentTable(int sid, String sname, String scity) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.scity = scity;
	}

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public String getScity() {
		return scity;
	}

	public void setScity(String scity) {
		this.scity = scity;
	}

	@Override
	public String toString() {
		return "StudentTable [sid=" + sid + ", sname=" + sname + ", scity=" + scity + "]";
	}

}
