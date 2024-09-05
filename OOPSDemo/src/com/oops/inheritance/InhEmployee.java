package com.oops.inheritance;

public class InhEmployee {
	String name;
	String city;
	
	public InhEmployee(String name, String city) {
		super();
		this.name = name;
		this.city = city;
	}

	void getDetails() {
		System.out.println(name+city);
	}
}
