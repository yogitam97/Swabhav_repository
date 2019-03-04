package com.techlabs.arrayCount;

import java.util.Arrays;
import java.util.HashMap;

public class TestCountElementsInArray {
	public static void CountElements(int arr[]) {
		HashMap<Integer,Integer> elementCount=new HashMap<Integer,Integer>();
		
		for(int i:arr)
			if(elementCount.containsKey(i))
				elementCount.put(i,elementCount.get(i)+1);
			else
				elementCount.put(i,1);
		System.out.println("Input array: "+Arrays.toString(arr));
		System.out.println(elementCount);
	}
	public static void main(String[] args) {
		CountElements(new int[] {1,1,1,2,2,3,5,1,5,6,5,5,4,4,2,3});
	}

}
