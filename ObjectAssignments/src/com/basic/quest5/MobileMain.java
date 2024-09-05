package com.basic.quest5;

public class MobileMain {
	public static void main(String[] args) {
		Mobile mobile1 = new Mobile("M2", "Samsung", "Blue");
		Mobile mobile2 = new Mobile("I17pro", "iPhone", "Light Green");
		Mobile mobile3 = new Mobile("13pro", "RealMe", "Black");
		Mobile mobile4 = new Mobile("17pro", "RealMe", "Black");
		Mobile mobile5 = new Mobile("15pro", "RealMe", "Black");
	
		Mobile[] mobileArray = { mobile1, mobile2, mobile3 };

		for (Mobile mobile : mobileArray) {
			mobile.getDetails();
		}
		for (Mobile mobile : mobileArray) {
			if (mobile.brand.equals("Samsung")) {
				mobile.getDetails();
			}
		}
	}
}
