package com.techlabs.account.exception;

public class InsuffiecientFundException extends RuntimeException{
	
	public InsuffiecientFundException(Account account) {
		super("You have insuffiecient balance\n"
				+ "Minimum balance should be 500\n"
				+ "Account no:"+account.getaccno()+
				" Holder name:"+account.getname()+" Balance is:"+account.getbalance());
	}
	

}
