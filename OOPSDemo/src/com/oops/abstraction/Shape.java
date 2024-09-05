package com.oops.abstraction;

public abstract class Shape {
	abstract void area(int x, int y);
	//concrete method 
	void show() {
		System.out.println("Calculating Area");
	}
}
