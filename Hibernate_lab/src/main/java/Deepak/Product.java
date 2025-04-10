package Deepak;


import javax.persistence.Id;

import org.hibernate.annotations.Entity;

@Entity // make class as table
public class Product {
	@Id // pid as primary key
	private int pid;
	private String pname;
	private float pprice;

//constructor super class
	// with fields
	// setter and getter
	// toString
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Product(int pid, String pname, float pprice) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.pprice = pprice;
	}

	public int getPid() {
		return pid;
	}

	@Override
	public String toString() {
		return "Product [pid=" + pid + ", pname=" + pname + ", pprice=" + pprice + "]";
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public float getPprice() {
		return pprice;
	}

	public void setPprice(float pprice) {
		this.pprice = pprice;
	}

}