package com.basics.quest4;

public class TrainingMain {
public static void main(String[] args) {
	Training training=new Training();
	String[] courses=training.showCourses();
	for(String course:courses) {
		System.out.println(course);
	}
	training.showTrainers("Sripriya","Lavanya");
}
}
