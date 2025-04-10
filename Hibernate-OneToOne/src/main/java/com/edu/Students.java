package com.edu;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Students {
	@Id
	@Column(name="student_id")
	private int studentId;
	@Column(name="student_name", length=50, nullable=false)
	private String studentName;
	@OneToOne
	@JoinColumn(name="laptop_Id")
	private Laptop laptop;
	
	public Students(int studentId, String studentName, Laptop laptop) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.laptop = laptop;
	}

	public Students() {
		super();
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public Laptop getLaptop() {
		return laptop;
	}

	public void setLaptop(Laptop laptop) {
		this.laptop = laptop;
	}

	@Override
	public String toString() {
		return "Students [studentId=" + studentId + ", studentName=" + studentName + ", laptop=" + laptop + "]";
	}
	
	
	
}
