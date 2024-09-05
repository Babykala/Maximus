package com.oops.encap;

public class StudMain {
public static void main(String[] args) {
	Student student=new Student();
	student.setStudentId(25);
	student.setStudentName("Priya");
	student.setPG(false);
	
	System.out.println(student.getStudentName());
	System.out.println(student);
}
}
