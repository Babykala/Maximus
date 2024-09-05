package com.inher.quest2;

public class ATMMain {
public static void main(String[] args) {
	System.out.println("Current Account Details:");
	Account account=new Current(2000);
	account.deposit(1000);
	account.withdraw(500);
	System.out.println(account.getBalance());
	
	
	System.out.println("Savings Account Details:");
	account=new Savings(5000);
	account.deposit(1000);
	account.withdraw(500);
	System.out.println(account.getBalance());
	
	
}
}
