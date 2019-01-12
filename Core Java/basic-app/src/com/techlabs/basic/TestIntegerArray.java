package com.techlabs.basic;

public class TestIntegerArray {

	public static void main(String[] args) {
		int no=10;
		changeNumToZero(no);
		System.out.println(no);
		int nos[]= {10,20,30};
		changeAllNumToZero(nos);
		for(int n:nos) {
			System.out.println(n);
		}
	}
	private static void changeNumToZero(int n) {
		n=0;
	}
	private static void changeAllNumToZero(int nos[]) {
		for(int i=0;i<nos.length;i++) {
			nos[i]=0;
		}
	}
}
