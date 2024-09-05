package com.oops.abstraction;

public class AbsMain {
public static void main(String[] args) {
	Shape shape=new Rectangle();
	shape.show();
	shape.area(4, 5);
		
	shape=new Triangle();
	shape.show();
	shape.area(2, 3);
	
	//downcasting triangle to shape
	Triangle triangle=(Triangle)shape;
	triangle.printTypes();
}
}
