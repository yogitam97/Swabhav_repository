package com.techlabs.account.exception;

public class TestAccount {

	public static void main(String[] args) {
		Account acc1 = new Account(101, "yogita", 1000);
		try {
			acc1.withdraw(1000);
		}
		catch (InsuffiecientFundException ex) {
			System.out.println(ex.getMessage());
		}
	

	}

}
