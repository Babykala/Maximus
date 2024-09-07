package com.excepton.basic;

public class ExMain {
public static void main(String[] args) {
	System.out.println("welcome");
	try {
	String value = args[0];
	System.out.println("value " + value);
//	String value2 = args[1];
//	System.out.println("value " + value1+value2);
	int num = Integer.parseInt(value);
	System.out.println("Number " + num);
	int result = 10 / num;
	System.out.println("Result " + result);
	}
	catch(Exception e){
		System.out.println(e);
		System.out.println(e.getMessage());
	}
	System.out.println("Work done");
}
}
