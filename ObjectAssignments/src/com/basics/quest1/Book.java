package com.basics.quest1;

public class Book {

	String title;
	String author;
	double price;
	String category;
	public Book(String title, String author, double price, String category) {
		super();
		this.title = title;
		this.author = author;
		this.price = price;
		this.category = category;
	}
	
	void getDetails() {
		System.out.println("Book Details: "+title+"\n"+author+"\n"+price+"\n"+category);
	}
	
	void checkBookType(double price) {
		if(price>500) {
			System.out.println("Premium Books");
		}else {
			System.out.println("Standard Book");
		}
	}

}
