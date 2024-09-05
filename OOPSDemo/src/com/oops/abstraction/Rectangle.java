package com.oops.abstraction;

public class Rectangle extends Shape {

	@Override
	void area(int x, int y) {
		System.out.println("Rectangle "+(2*x*y));
	}

}
