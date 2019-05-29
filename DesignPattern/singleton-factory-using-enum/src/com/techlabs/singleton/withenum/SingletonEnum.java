package com.techlabs.singleton.withenum;

public enum SingletonEnum {
	INSTANCE;
	
	private int count;
	public void setCount(int count) {
		this.count = count;
	}

	public void doProcess() {
		System.out.println("DO Operations:-" + this.count+" "+this.hashCode());
	}
}
