package com.productapp.service;

import java.time.LocalDate;

import com.productapp.model.Product;

public interface IProductService {
	Product[] getAll();

	Product[] getByBrand(String brand);

	Product[] getByLesserPrice(String productName, double price);

	String[] getProductNames(String brand);

	Product getById(int productId);
	
	String[] getNamesByBrand(String category);
	
	Product[] getByDateBefore(String brand,LocalDate currentDate); //if current date is less than the expiry date

}
