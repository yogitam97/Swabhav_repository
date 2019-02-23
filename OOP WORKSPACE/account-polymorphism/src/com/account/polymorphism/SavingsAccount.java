package com.account.polymorphism;

public class SavingsAccount extends Account {

	public SavingsAccount(int accno, String name, double balance) {
		super(accno, name, balance);
	}

	double newbalance = getBalance();

	@Override
	public void withdraw(double amount) {
		if (newbalance - amount < 500) {
			System.out.println("Minimum balance should be 500");
			return;
		}
		if (newbalance - amount > 500) {
			newbalance = newbalance - amount;
		}
	}

}
