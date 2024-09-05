package com.abs.quest1;

public abstract class Employee {
	String empName;
	double salary;
	int empId;
	final String COMPANYNAME = "MAXIMUS";

	public Employee(String empName, double salary, int empId) {
		super();
		this.empName = empName;
		this.salary = salary;
		this.empId = empId;
	}

	abstract void calcBonus(double amount);

	String[] showCourses() {
		return new String[] { "Java", "Spring", "React" };
	}

	abstract void showProjects();

	final void showRules(){
		officeHours();
		System.out.println("Leave Policies:Casual Leave,Vacation leave");
		System.out.println("Od policies");
	}

	private void officeHours() {
		System.out.println("14hrs per day");
	}

}
