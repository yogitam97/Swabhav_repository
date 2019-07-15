package com.techlabs.prototype;

public class Book {
	private int bookId;
	private String name;
	
	@Override
	public String toString() {
		return "Book [bookId=" + bookId + ", name=" + name + "]";
	}
	public int getBookId() {
		return bookId;
	}
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
}
