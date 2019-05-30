package com.techlabs.adapter;

import java.util.Iterator;
import java.util.LinkedList;

public class QueueAdapter<T> implements IQueue<T>,Iterable<T>{
	private LinkedList<T> q;
	public static int count=0;

	public QueueAdapter(){
		q=new LinkedList<T>();
	}
	@Override
	public void enqueue(Object item) {
		q.addLast((T) item);
		count++;
	}

	@Override
	public T dequeue() {
		count--;
		return q.removeFirst();
	}

	@Override
	public int count() {
		return count;
	}
	
	@Override
	public Iterator<T> iterator() {
		return q.iterator();
	}

}
