package com.techlabs.basic;
import java.util.Scanner;
import java.util.Arrays;
public class TestEvenOdd {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter range:");
		int range = sc.nextInt();
		int a[]=Even(range);
		for(int e:a)
			System.out.println("Even:"+e);
		int b[]=Odd(range);
		for(int i:b)
			System.out.println("Odd:"+i);
	}
	private static int[] Even(int range) {
		int n[]=new int[range/2 +2];
		int j=0;
		for(int i=0;i<=range;i+=2) 
		{
				n[j]=i;
				j++;
		}
		return n;
	}
	private static int[] Odd(int range) {
		int n[]=new int[range/2 +2];
		int j=0;
		for(int i=1;i<=range;i+=2) 
		{
				n[j]=i;
				j++;
		}
		return n;	
		}
}
