package com.techlabs.singleton.test;

import com.techlabs.singleton.Singleton;

public class TestSingleton {

	public static void main(String[] args) {
		Singleton instance1=Singleton.getInstance();
		Singleton instance2=Singleton.getInstance();
		
		System.out.println(instance1);
		System.out.println(instance2);
	}

}
