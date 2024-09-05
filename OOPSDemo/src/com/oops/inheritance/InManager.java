package com.oops.inheritance;

public class InManager extends InhEmployee {
	double salary;
	
	public InManager(String name, String city, double salary) {
		super(name, city);
		this.salary = salary;
	}

	void calcBonus(int amount) {
		System.out.println("Bonus "+(amount+salary));
	}
}
