package com.techlabs.hashset;

import java.util.LinkedHashSet;

public class TestLinkedHashSet {

	public static void main(String[] args) {
		LinkedHashSet<String> ls=new LinkedHashSet<String>();
		ls.add("A");
		ls.add("C");
		ls.add("Z");
		ls.add("B");
		System.out.println(ls);
		ls.remove("B");
		System.out.println(ls);
		for(String i:ls)
			if(i.equals("Z"))
				ls.remove(i);
				ls.add("Y");
		System.out.println(ls);
	}

}
