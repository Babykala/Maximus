package com.abs.quest1;

public abstract class TeamLead extends Employee {

	public TeamLead(String empName, double salary, int empId) {
		super(empName, salary, empId);
	}

	@Override
	void calcBonus(double amount) {
		System.out.println("Bonus " + (salary + amount));

	}

	//own method
	void corporateServices() {
		System.out.println("sports activities in school");
	}

}
