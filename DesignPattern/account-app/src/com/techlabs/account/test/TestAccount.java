package com.techlabs.account.test;

import com.techlabs.account.IAccount;
import com.techlabs.account.proxy.ProxyAccount;

public class TestAccount {

	public static void main(String[] args) {
		ProxyAccount pa = new ProxyAccount(101, "yogita", 10000);
		pa.deposite(1000);
		System.out.println(pa.getBalance());
	}

}
