package com.headfirst.codemagnets;

import java.util.ArrayList;

public class ArrListMagnet {

	public static void main(String[] args) {
		ArrayList<String> list=new ArrayList<String>();
		list.add(0,"zero");
		list.add(1,"one");
		list.add(2,"two");
		list.add(3,"three");
		printAL(list);
		
		if(list.contains("three"))
		{
			list.add(4,"four");
		}
		list.remove(2);
		printAL(list);
		
		if(list.indexOf("four")!=4)
		{
			list.add(4,"4.2");
		}
		printAL(list);
		
		if(list.contains("two"))
		{
			list.add("2.2");
		}
		
		printAL(list);

	}
	
	public static void printAL(ArrayList<String> al)
	{
		for(String element : al)
		{
			System.out.print(element+ " ");
		}
		System.out.println(" ");
	}

}

