package com.oops.override;

public class Car extends Vehicle {
	
	void getMileage() {
		System.out.println("Printing mileage for car");
		super.getMileage();
	}
}
