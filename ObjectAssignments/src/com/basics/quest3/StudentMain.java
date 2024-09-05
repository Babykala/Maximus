package com.basics.quest3;

public class StudentMain {
public static void main(String[] args) {
	Student student=new Student("Kala","ECE");
	student.printDetails();
	System.out.println(student.getGrades(new int[] {70,80,75,80,95}));
	System.out.println(student.getGrades(new int[] {40,50,25,30,15}));
}
}
