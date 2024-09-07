package com.productapp.main;

import java.time.LocalDate;

import com.productapp.model.Product;
import com.productapp.service.IProductService;
import com.productapp.service.ProductServiceImpl;

public class Client {
public static void main(String[] args) {
	IProductService service=new ProductServiceImpl();
	Product[] products=service.getAll();
	for (Product product : products) {
		System.out.println(product);
	}
	//getByBrand
	products=service.getByBrand("Samsung");
	for (Product product : products) {
		System.out.println("List of products by brand"+product);
	}
	
	//getByLesserPrice
	products=service.getByLesserPrice("mobile", 30000.0);
	for (Product product : products) {
		System.out.println("List of products by price"+product);
	}
	//getProductNames(String brand)
	String[] productNames=service.getProductNames("oneplus");
	for (String product : productNames) {
		System.out.println("List of product Names"+product);
	}
	//getById(int productId)
	Product product=service.getById(4);
	System.out.println("Product: "+product);
	
	//getNamesByBrand(String category)
	String[] productNamesByCategory =service.getNamesByBrand("Mobiles");
	for (String product1 : productNamesByCategory) {
		System.out.println("List of products by brand"+product1);
	}
	//getByDateBefore(String brand, LocalDate currentDate)
	products=service.getByDateBefore("Bose",LocalDate.now());
	for (Product product1 : products) {
		System.out.println("List of products by brand"+product1);
	}
	}
}
