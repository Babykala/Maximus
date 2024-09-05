package com.oops.basic;

public class Employee {
	String name;
	double salary;
	public Employee(String name, double salary) {
		super();
		this.name = name;
		this.salary = salary;
	}
	void getDetails() {
		System.out.println("name "+name);
		System.out.println("salary "+salary);
	}
	String greet(String message) {
		return message+" "+name;
	}
	

}
