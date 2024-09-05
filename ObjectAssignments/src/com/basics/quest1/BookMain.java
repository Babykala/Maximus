package com.basics.quest1;

public class BookMain {
	public static void main(String[] args) {
		Book book1=new Book("Java Programming","xyz",1000.0,"abc");
		Book book2=new Book("React","xxx",400.0,"aaa");
		book1.getDetails();
		book1.checkBookType(600.0);
		book2.getDetails();
		book2.checkBookType(200);
	}

}
