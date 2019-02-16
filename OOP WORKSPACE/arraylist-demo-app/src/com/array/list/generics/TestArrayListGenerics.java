package com.array.list.generics;

import java.util.ArrayList;

public class TestArrayListGenerics {

	public static void main(String[] args) {
		ArrayList<String> myList=new ArrayList<String>();
		myList.add("I");
		myList.add("am");
		myList.add("yogita");
		System.out.println(myList);
		for (int i=0;i<myList.size();i++)
			System.out.print(myList.get(i)+" ");
	}

}
