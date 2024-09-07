package com.inter.basics1;

public class UPIPayment implements IPaymentGateway {

	@Override
	public void payBills(double amount) {
		System.out.println("UPI: " + amount);
	}

}
