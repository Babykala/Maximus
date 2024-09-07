package com.training.quest1;

import java.util.Iterator;

public class User {

	public static void main(String[] args) {
		IInstitute institute=new StudentCourses();
		String[] courses=institute.showCourses();
		System.out.println("Student courses are: ");
		for (String course : courses) {
			System.out.println(course);
		}
		institute=new EmployeeCourses();
		String[] empCourses=institute.showCourses();
		System.out.println("Employee courses are: ");
		for (String course : empCourses) {
			System.out.println(course);
		}
	}

}
