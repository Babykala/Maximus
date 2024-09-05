package com.oops.basic;

public class OverloadDemo {
public static void main(String[] args) {
	Shape shape=new Shape();
	shape.area(10);
	shape.area((int)2.5f);
	int rect =(int)shape.area(10,20);
	System.out.println("rectangle "+rect);
	System.out.println("Triangle "+shape.area(10, 2.5f));
}
}
