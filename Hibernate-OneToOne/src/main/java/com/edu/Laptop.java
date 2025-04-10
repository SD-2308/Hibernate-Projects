package com.edu;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Laptop {
	@Id
	@Column(name="laptop_id")
	private int laptopId;
	@Column(name="laptop_name", length=50, nullable=false, unique=true)
	private String laptopName;
	
	@OneToOne(mappedBy = "laptop")
	@JoinColumn(name="student_id")
	private Students students;
	
	public Students getStudents() {
		return students;
	}

	public void setStudents(Students students) {
		this.students = students;
	}

	public Laptop(int laptopId, String laptopName) {
		super();
		this.laptopId = laptopId;
		this.laptopName = laptopName;
	}

	public Laptop() {
		super();
	}

	public int getLaptopId() {
		return laptopId;
	}

	public void setLaptopId(int laptopId) {
		this.laptopId = laptopId;
	}

	public String getLaptopName() {
		return laptopName;
	}

	public void setLaptopName(String laptopName) {
		this.laptopName = laptopName;
	}

	@Override
	public String toString() {
		return "Laptop [laptopId=" + laptopId + ", laptopName=" + laptopName + "]";
	}
	
	
	
}