package com.abs.quest1;

public class Manager extends Employee {
	private String activity;
	
	public Manager(String empName, double salary, int empId, String activity) {
		super(empName, salary, empId);
		this.activity = activity;
	}

	@Override
	void calcBonus(double amount) {
		System.out.println("Bonus "+(salary+amount));
	}

	@Override
	void showProjects() {
		System.out.println("Working in cloud platform");
	}
	
	//own method
	void funClub() {
		System.out.println("Club activity: "+activity);
	}

}
