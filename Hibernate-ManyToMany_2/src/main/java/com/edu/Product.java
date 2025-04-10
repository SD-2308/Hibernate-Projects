package com.edu;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
@Entity
public class Product {
	@Id
	@Column(name="product_id")
	private int ProductId;
	
	@Column(name="Product_name" , length= 50, nullable= false)
	private String ProductName;
	
	@ManyToMany(mappedBy = "products")
	private List<Customer> customer;
	
	public List<Customer> getCustomer() {
		return customer;
	}
	public void setCustomer(List<Customer> customer) {
		this.customer = customer;
	}
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Product(int productId, String productName) {
		super();
		ProductId = productId;
		ProductName = productName;
	}
	public int getProductId() {
		return ProductId;
	}
	public void setProductId(int productId) {
		ProductId = productId;
	}
	public String getProductName() {
		return ProductName;
	}
	public void setProductName(String productName) {
		ProductName = productName;
	}
	@Override
	public String toString() {
		return "Product [ProductId=" + ProductId + ", ProductName=" + ProductName + "]";
	}
	
	
}
