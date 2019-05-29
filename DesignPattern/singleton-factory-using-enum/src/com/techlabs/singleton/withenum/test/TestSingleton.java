package com.techlabs.singleton.withenum.test;

import com.techlabs.singleton.withenum.SingletonEnum;

public class TestSingleton {

	public static void main(String[] args) {
		SingletonEnum.INSTANCE.setCount(1);
		SingletonEnum.INSTANCE.setCount(2);
		SingletonEnum.INSTANCE.doProcess();
		SingletonEnum.INSTANCE.doProcess();
		SingletonEnum.INSTANCE.doProcess();
	}

}
