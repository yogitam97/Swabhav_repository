package com.techlabs.observerpattern;

public class SMSObserver implements IBalanceChangeObserver{

	@Override
	public void balanceChange(Account account) {
		System.out.println(account.getAcc_no()+" your balance is updated.\n"
				+ "Current balance is :"+account.getBalance());
	}

}
