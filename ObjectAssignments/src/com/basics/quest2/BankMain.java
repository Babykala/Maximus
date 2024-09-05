package com.basics.quest2;

public class BankMain {
public static void main(String[] args) {
	Bank bank=new Bank(1500);
	bank.withdraw(1000);
	System.out.println("Balance after withdrawl:\t"+bank.getBalance());
	bank.deposit(200);
	System.out.println("Balance after deposit:\t"+bank.getBalance());
}
}
