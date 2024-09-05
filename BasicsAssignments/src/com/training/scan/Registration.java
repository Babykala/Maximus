package com.training.scan;

public class Registration {
public static void main(String[] args) {
	String[] names=new String[] {"Kala","Priya"};
	
	for (String name : names) {
		String res= name.equals("Rish")?"Name is not unique":"You are registered";
		System.out.println(res);
	}
}
}
