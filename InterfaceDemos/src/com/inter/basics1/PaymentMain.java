package com.inter.basics1;

public class PaymentMain {

	public static void main(String[] args) {
		IPaymentGateway payment=new UPIPayment();
		payment.payBills(1000);
		
		payment=new CashPayment();
		payment.payBills(2000);
		
		payment=new DebitCard();
		payment.payBills(3000);
		
		payment=new CreditCard();
		payment.payBills(4000);
	}

}
