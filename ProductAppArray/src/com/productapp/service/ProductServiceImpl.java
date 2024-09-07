package com.productapp.service;

import java.time.LocalDate;

import com.productapp.model.Product;
import com.productapp.util.ProductUtil;

public class ProductServiceImpl implements IProductService {

	@Override
	public Product[] getAll() {
		Product[] products = ProductUtil.showProducts();
		return products;
	}

	@Override
	public Product[] getByBrand(String brand) {
		Product[] products = ProductUtil.showProducts();
		Product[] productsByBrand=new Product[products.length];
		int i=0;
		for (Product product : products) {
			if(product.getBrand().equals(brand)) {
				productsByBrand[i]=product;
				i++;
			}
		}
		return productsByBrand;
	}

	@Override
	public Product[] getByLesserPrice(String productName, double price) {
		Product[] products = ProductUtil.showProducts();
		Product[] productsByLesserPrice=new Product[products.length];
		int i=0;
		for (Product product : products) {
			if(product.getProductName().equalsIgnoreCase(productName)&&product.getPrice()<price) {
				productsByLesserPrice[i]=product;
				i++;
			}
		}
		return productsByLesserPrice;
	}

	@Override
	public String[] getProductNames(String brand) {
		Product[] products = ProductUtil.showProducts();
		String[] productNamesByBrand=new String[products.length];
		int i=0;
		for (Product product : products) {
			if(product.getBrand().equalsIgnoreCase(brand)) {
				productNamesByBrand[i]=product.getProductName();
				i++;
			}
		}
		return productNamesByBrand;
	}

	@Override
	public Product getById(int productId) {
		Product[] products = ProductUtil.showProducts();
		for (Product product : products) {
			if(product.getProductId().equals(productId))
				return product;
		}
		return null;
	}

	@Override
	public String[] getNamesByBrand(String category) {
		Product[] products = ProductUtil.showProducts();
		String[] productNamesByBrand=new String[products.length];
		int i=0;
		for (Product product : products) {
			if(product.getCategory().equalsIgnoreCase(category)) {
				productNamesByBrand[i]=product.getProductName();
				i++;
			}
		}
		return productNamesByBrand;
	}

	@Override
	public Product[] getByDateBefore(String brand, LocalDate currentDate) {
		Product[] products = ProductUtil.showProducts();
		Product[] productNamesByDate=new Product[products.length];
		int i=0;
		for (Product product : products) {
			if(product.getBrand().equals(brand)&&product.getExpiryDate().isAfter(currentDate)) {
				productNamesByDate[i]=product;
				i++;
			}
		}
		return productNamesByDate;
	}

}
