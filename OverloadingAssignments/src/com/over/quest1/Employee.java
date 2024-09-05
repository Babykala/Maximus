package com.over.quest1;

public class Employee {
	String name;
	String designation;

	public Employee(String name, String designation) {
		super();
		this.name = name;
		this.designation = designation;
	}

	void calcBonus(double basicAllowance) {
		System.out.println("Bonus:" + basicAllowance);
	}
	void calcBonus(double basicAllowance, String gift) {
		System.out.println("Bonus:"+basicAllowance+"gift: "+gift);
	}
	void calcBonus(double basicAllowance,String gift,double carAllowance,double houseAllowance) {
		System.out.println("Bonus:"+basicAllowance+"gift: "+gift+"carAllowance: "+carAllowance+"HouseAllowance: "+houseAllowance );
	}

}

