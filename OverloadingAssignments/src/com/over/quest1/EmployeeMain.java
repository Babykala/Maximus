package com.over.quest1;

public class EmployeeMain {
	public static void main(String[] args) {
		Employee employee1 = new Employee("Lavanya", "Manager");
		Employee employee2 = new Employee("Kala", "Programmer");
		Employee employee3 = new Employee("Priya", "Director");

		Employee[] employeeArray = new Employee[3];
		employeeArray[0] = employee1;
		employeeArray[1] = employee2;
		employeeArray[2] = employee3;

		for (Employee employee : employeeArray) {
			switch (employee.designation.toLowerCase()) {
			case "programmer":
				employee.calcBonus(20000.0);
				break;
			case "manager":
				employee.calcBonus(50000.0, "Bike");
				break;
			case "director":
				employee.calcBonus(60000.0, "car", 2000.0, 8000.0);
				break;
			default:
				break;
			}
		}
	}

}
