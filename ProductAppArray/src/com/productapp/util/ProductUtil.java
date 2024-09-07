package com.productapp.util;

import java.time.LocalDate;
import com.productapp.model.Category;
import com.productapp.model.Product;

public class ProductUtil {
public static Product[] showProducts() {
	Product[] products=new Product[] {
			new Product(1,"Mobile","Samsung",Category.MOBILES.name(),25000,LocalDate.of(2024, 12, 20)),
			new Product(2,"Mobile","Oneplus",Category.MOBILES.name(),40000,LocalDate.of(2024, 2, 18)),
			new Product(3,"HeadPhones","Bose",Category.MUSICSYSTEMS.name(),120000,LocalDate.of(2024, 12, 22)),
			new Product(4,"television","Samsung",Category.ELECTRONICS.name(),225000,LocalDate.of(2024, 12, 20)),
			new Product(5,"Earphones","OnePlus",Category.MUSICSYSTEMS.name(),25000,LocalDate.of(2024, 12, 20))
	};
	return products;
	}
}

