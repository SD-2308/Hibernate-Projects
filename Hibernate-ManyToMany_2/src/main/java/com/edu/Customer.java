package com.edu;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
public class Customer {
	@Id
	@Column(name="customer_id")
	private int CustomerId;
	
	@Column(name="customer_name", length= 50, nullable = false)
	private String Name;
	
	
	@ManyToMany
	@JoinTable(name="Customer_Data", joinColumns = {@JoinColumn(name="product_id")}, inverseJoinColumns = {@JoinColumn(name = "customer_id")})
	private List<Product> products;

	

	public List<Product> getProducts() {
		return products;
	}

	public void setProducts(List<Product> products) {
		this.products = products;
	}

	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Customer(int customerId, String name) {
		super();
		CustomerId = customerId;
		Name = name;
	}

	public int getCustomerId() {
		return CustomerId;
	}

	public void setCustomerId(int customerId) {
		CustomerId = customerId;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	@Override
	public String toString() {
		return "Customer [CustomerId=" + CustomerId + ", Name=" + Name + "]";
	}
	
	

}
