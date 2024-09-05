package com.oops.abstraction;

public class Triangle extends Shape {

	@Override
	void area(int x, int y) {
		System.out.println("Triangle "+(0.5*x*y));
	}
	
	void printTypes() {
		System.out.println("Types: "+"Right-angle, Isoceles");
	}

}
