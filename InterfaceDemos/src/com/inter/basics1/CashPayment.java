package com.inter.basics1;

public class CashPayment implements IPaymentGateway {

	@Override
	public void payBills(double amount) {
		System.out.println("Cash: "+amount);
	}

}
