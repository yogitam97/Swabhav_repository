package com.techlabs.adapter.test;

import com.techlabs.adapter.IQueue;
import com.techlabs.adapter.QueueAdapter;

public class TestAdapter {
public static void main(String args[]) {
	IQueue e=new QueueAdapter<Integer>();
	
	QueueAdapter<Integer> q=new QueueAdapter();
	q.enqueue(10);
	q.enqueue(20);
	q.enqueue(30);
	
	System.out.println(q.count());
	q.dequeue();
	System.out.println(q.count());
	for(Integer i:q) {
		System.out.println(i);
	}
}
}
