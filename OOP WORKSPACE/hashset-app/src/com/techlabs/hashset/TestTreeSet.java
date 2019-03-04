package com.techlabs.hashset;

import java.util.*;

public class TestTreeSet {

	public static void main(String[] args) throws Exception{
		TreeSet<String> ts=new TreeSet<String>();
		ts.add("A");
		ts.add("C");
		ts.add("B");
		ts.add("Y");
		System.out.println(ts);
		ts.remove("B");
		System.out.println(ts);
		for(String i:ts)
			if(i.equals("Y"))
				ts.remove(i);
				ts.add("X");
		System.out.println(ts);
	}

}
