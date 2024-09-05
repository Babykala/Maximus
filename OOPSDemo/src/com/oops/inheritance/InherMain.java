package com.oops.inheritance;

public class InherMain {

	public static void main(String[] args) {
		InhEmployee employee=new InhEmployee("John","Bangalore");
//		employee.name="John";
//		employee.city="Bengaluru";
		employee.getDetails();
		
		InManager manager=new InManager("Kala","chennai",1000.0);
//		manager.name="Kumar";
//		manager.city="Chennai";
//		manager.salary=10000.0;
		manager.getDetails();
		manager.calcBonus(1000);

	}

}
