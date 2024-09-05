package com.abs.quest2;

public abstract class Bank {
abstract void carLoan();
abstract void houseLoan();
abstract void educationLoan();

void admin() {
	System.out.println("Admin details");
}
}
