package com.abs.quest1;

public class Developer extends TeamLead {
String[] hobbies;

	public Developer(String empName, double salary, int empId, String... hobbies ) {
	super(empName, salary, empId);
	this.hobbies = hobbies;
}

	@Override
	void showProjects() {
		System.out.println("Working in spring boot");
	}
//own method
	void printHobbies() {
		for (String hobby : hobbies) {
			System.out.println("Hobby "+hobby);
		}
	}
}
