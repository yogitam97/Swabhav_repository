package com.techlabs.hashmap;

import java.util.HashMap;
import java.util.Map;

public class TestHashMap {

	public static void main(String[] args) {
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		print(map);
		map.put("Yogita", 7);
		map.put("Shekhar", 20);
		map.put("Pranjal", 5);
		map.put("Dhruv", 21);
		print(map);
		System.out.println(map.size());
		if (map.containsKey("Shekhar")) {
			Integer a = map.get("Shekhar");
			System.out.println("Roll no of Shekhar is :" + a);
		}
	}

	public static void print(Map<String, Integer> map) {
		if (map.isEmpty())
			System.out.println("Map is empty");
		System.out.println(map);
	}

}
