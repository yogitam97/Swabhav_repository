package com.techlabs.account;

public interface IAccount {
	public void deposite(double amount);
	public void withdraw(double amount);
	public double getBalance();
}
