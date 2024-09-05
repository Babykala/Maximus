package com.abs.quest2;

public class Branch1 extends Bank {

	@Override
	void carLoan() {
		System.out.println("Car loan in branch1");
	}

	@Override
	void houseLoan() {
		System.out.println("house loan in branch1");
		
	}

	@Override
	void educationLoan() {
		System.out.println("education loan in branch1");
		
	}
	
	void payBills() {
		System.out.println("paying bills in b1");
	}

}
