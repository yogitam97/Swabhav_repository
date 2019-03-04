package com.techlabs.hashset;

import java.util.HashSet;

public class TestHashset {

	public static void main(String[] args) {
		HashSet<String> hashset=new HashSet<String>();
		hashset.add("A");
		hashset.add("C");
		hashset.add("B");
		System.out.println(hashset);
		for(String i:hashset)
			if(i.equals("C"))
				hashset.remove(i);
				hashset.add("G");
		System.out.println(hashset);
	}

}
