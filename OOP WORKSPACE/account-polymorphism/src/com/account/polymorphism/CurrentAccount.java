package com.account.polymorphism;

public class CurrentAccount extends Account {

	public CurrentAccount(int accno, String name, double balance) {
		super(accno, name, balance);
	}

	@Override
	public void withdraw(double amount) {

		if (balance - amount > -2000) {
			balance = balance - amount;
		}
		if (balance - amount < -2000) {
			System.out.println("Minimum overdue balance is 2000");
		}
	}

}
