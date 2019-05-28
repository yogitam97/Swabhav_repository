package com.techlabs.service;

public class DataService {
	private static DataService dataservice;
	private DataService() {
		System.out.println("service started");
	}

	public void doSomething() {
		System.out.println("Do Something");
	}
	public static DataService getInstance() {
		if(dataservice==null) {
			dataservice=new DataService();
			return dataservice;
		}
		return dataservice;
	}
}
