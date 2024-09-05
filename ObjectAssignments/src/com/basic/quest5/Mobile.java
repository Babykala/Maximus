package com.basic.quest5;

public class Mobile {
String model;
String brand;
String color;
public Mobile(String model, String brand, String color) {
	super();
	this.model = model;
	this.brand = brand;
	this.color = color;
}
void getDetails() {
	System.out.println("Mobile details: \n"+"Model: "+model+" Brand:"+brand+" Color:"+color);
}
}
