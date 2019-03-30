package com.techlabs.account.exception;

public class Account {
	private int accno;
	private String name;
	private double balance;
	private double amount;
	

	public Account(int accno, String name, double balance) {
		this.accno = accno;
		this.name = name;
		this.balance = balance;
	}

	public Account(int accno, String name) {
		this(accno, name, 500);
	}

	public void deposit(double amount) {
		balance = balance + amount;
	}

	public void withdraw(double amount) {

		if (balance - amount < 500) {
			throw new InsuffiecientFundException(this);
		}
		if (balance - amount > 500) {
			balance = balance - amount;
		}
	}

	public int getaccno() {
		return accno;
	}

	public String getname() {
		return name;
	}

	public double getbalance() {
		return balance;
	}

	public double getamount() {
		return amount;
	}

}

