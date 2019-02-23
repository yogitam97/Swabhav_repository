package com.account.polymorphism;

public abstract class Account {
	private int accno;
	private String name;
	protected double balance;
	
	public Account(int accno,String name,double balance) {
		this.accno=accno;
		this.name=name;
		this.balance=balance;
	}
	
	public void deposit(double amount) {
		this.balance+=amount;
	}
	
	abstract public void withdraw(double amount);

	public int getAccno() {
		return accno;
	}

	public String getName() {
		return name;
	}

	public double getBalance() {
		return balance;
	}
	
	
	
	
}
