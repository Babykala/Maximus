package com.oops.basic;

public class EmpMain {
	public static void main(String[] args) {
		Employee employee = new Employee("Kala", 5000);
//		employee.name="xyz";
//		employee.salary=1000;

		employee.getDetails();
		String result = employee.greet("Welcome");
		System.out.println(result);

		Employee employee1 = new Employee("Rish", 500);
//		employee1.name="Kala";
//		employee1.salary=2000;
		employee1.getDetails();
		String result1 = employee.greet("Welcome ");
		System.out.println(result1);

	}
}
