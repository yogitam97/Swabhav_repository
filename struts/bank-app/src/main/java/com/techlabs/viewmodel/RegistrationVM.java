package com.techlabs.viewmodel;

public class RegistrationVM {
	private String name;
	private String password;
	private String confirmPassword;
	private double balance;
	
	public RegistrationVM() {
		
	}
	public void setName(String name) {
		this.name = name;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setConfirmPassword(String confirmPassword) {
		this.confirmPassword = confirmPassword;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public String getName() {
		return name;
	}

	public String getPassword() {
		return password;
	}

	public String getConfirmPassword() {
		return confirmPassword;
	}

	public double getBalance() {
		return balance;
	}

}
