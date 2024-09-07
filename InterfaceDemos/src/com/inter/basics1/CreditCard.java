package com.inter.basics1;

public class CreditCard extends CardPayment {

	@Override
	public void payBills(double amount) {
		System.out.println("Debit: "+amount);
	}

}
