package com.abs.quest2;

public abstract class Branch2 extends Bank {
	@Override
	void houseLoan() {
		System.out.println("house loan in branch1");
	}

	@Override
	void educationLoan() {
		System.out.println("education loan in branch1");
	}
	
	void showTypes() {
		System.out.println("Types in Branch 2");
	}
}
