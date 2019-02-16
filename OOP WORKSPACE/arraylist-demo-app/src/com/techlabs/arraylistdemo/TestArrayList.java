package com.techlabs.arraylistdemo;

import java.util.*;

public class TestArrayList {
	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add(10);
		al.add("yogita");
		al.add(33);
		al.add(null);
		System.out.println(al);
		al.remove(2);
		System.out.println(al);
		al.add(2, 13);
		al.add("yogita");
		System.out.println(al);
		al.add(2,"more");
		System.out.println(al);
	}

}
