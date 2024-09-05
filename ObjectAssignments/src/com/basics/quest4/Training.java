package com.basics.quest4;

public class Training {
	String[] showCourses() {
		String[] courses=new String[] {"Java","react"};
		
		return courses;
	}
	void showTrainers(String... names ) {
		for(String name:names) {
			System.out.println(name);
		}
	}
}
