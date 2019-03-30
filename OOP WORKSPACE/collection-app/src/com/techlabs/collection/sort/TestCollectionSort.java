package com.techlabs.collection.sort;

import java.util.ArrayList;
import java.util.Collections;

public class TestCollectionSort {

	public static void main(String[] args) {
		ArrayList<String> al=new ArrayList<String>();
		al.add("yogita");
		al.add("is");
		al.add("a");
		al.add("cat");
		al.add("lover");
		System.out.println(al);
		Collections.sort(al);
		System.out.println(al);
	}

}
