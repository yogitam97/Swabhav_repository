package com.techlabs.account;

public class Account {
	private int accno;
	private String name;
	private double balance;
	private double amount;
	private static int transactionCount;
	static {
		transactionCount = 0;
	}

	public Account(int accno, String name, double balance) {
		this.accno = accno;
		this.name = name;
		this.balance = balance;
	}

	public Account(int accno, String name) {
		this(accno, name, 500);
	}

	@Override
	public String toString() {
		String data=super.toString();
		return "Account no:" + accno + " Name: " + name + " Balance: " + balance;
		
	}
	public boolean equals(Account acc) {
		if(this==acc)
			return true;
		return (this.accno==acc.accno && this.name==acc.name
				&& this.balance==acc.balance);
		
	}

	public void deposit(double amount) {
		transactionCount++;
		balance = balance + amount;
	}

	public void withdraw(double amount) {

		if (balance - amount < 500) {
			System.out.println("Minimum balance should be 500");
			return;
		}
		if (balance - amount > 500) {
			balance = balance - amount;
			transactionCount++;
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

	public static int getTransactionCount() {
		return transactionCount;
	}

}
