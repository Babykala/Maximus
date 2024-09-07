package com.productapp.model;

import java.time.LocalDate;

public class Product {
	private Integer productId;
	private String productName;
	private String brand;
	private String category; // taken from enum
	private double price;
	private LocalDate expiryDate;
	
	public Product(int productId, String productName, String brand, String category, double price,
			LocalDate expiryDate) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.brand = brand;
		this.category = category;
		this.price = price;
		this.expiryDate = expiryDate;
	}
	public Integer getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public LocalDate getExpiryDate() {
		return expiryDate;
	}
	public void setExpiryDate(LocalDate expiryDate) {
		this.expiryDate = expiryDate;
	}
	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName=" + productName + ", brand=" + brand + ", category="
				+ category + ", price=" + price + ", expiryDate=" + expiryDate + "]";
	}

}
