package com.oops.encap;

public class Student {
	private int studentId;
	private String studentName;
	private boolean isPG;

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public boolean isPG() {
		return isPG;
	}

	public void setPG(boolean isPG) {
		this.isPG = isPG;
	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", isPG=" + isPG + "]";
	}
	
	

}
