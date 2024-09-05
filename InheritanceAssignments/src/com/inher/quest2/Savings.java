package com.inher.quest2;

public class Savings extends Account {

	public Savings(double balance) {
		super(balance);
	}
	
	@Override
	void withdraw(double amount) {
		double penalty=50;
		balance=balance-amount-penalty;
	}

	@Override
	void deposit(double amount) {
		balance=balance+amount;

	}

}
