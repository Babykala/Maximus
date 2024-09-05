package com.inher.quest2;

public class Current extends Account {

	public Current(double balance) {
		super(balance);
	}

	@Override
	void withdraw(double amount) {
		balance-=amount;
	}

	@Override
	void deposit(double amount) {
		balance+=amount;
	}

}
