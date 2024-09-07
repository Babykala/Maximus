package com.inter.basics1;

public class DebitCard extends CardPayment {

	@Override
	public void payBills(double amount) {
		System.out.println("credit: "+amount);
	}

}
