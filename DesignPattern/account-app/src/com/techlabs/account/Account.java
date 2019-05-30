package com.techlabs.account;

public class Account {
	private int acc_no;
	private String name;
	private double balance;

	public Account(int acc_no, String name, double balance) {
		this.acc_no = acc_no;
		this.name = name;
		this.balance = balance;
	}

	public void withdraw(double amount) {
		this.balance = balance - amount;
	}

	public void deposite(double amount) {
		this.balance = balance + amount;
	}

	public int getAcc_no() {
		return acc_no;
	}

	public String getName() {
		return name;
	}

	public double getBalance() {
		return balance;
	}
}
