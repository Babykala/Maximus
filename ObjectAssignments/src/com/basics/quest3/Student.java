package com.basics.quest3;

public class Student {
	String name;
	String department;

	public Student(String name, String department) {
		super();
		this.name = name;
		this.department = department;
	}

	void printDetails() {
		System.out.println("Student Details: " + name + " " + department);
	}

	String getGrades(int[] marks) {
		int sum = 0;
		double average = 0.0;
		for (int mark : marks) {
			sum += mark;
		}
		average = sum / marks.length;
		System.out.println(average);
		if (average > 90 && average <= 100) {
			return "A";
		} else if (average > 80 && average <= 90) {
			return "B";
		} else if (average > 70 && average <= 80) {
			return "C";
		} else if (average >= 60 && average <= 70) {
			return "D";
		} else if (average > 50 && average <= 59) {
			return "E";
		} else
			return "Fail";
		// grade as A(90-100) or B(80-90) or C(70-80) or D(60-70) or E(50-59) or fail
	}
}
