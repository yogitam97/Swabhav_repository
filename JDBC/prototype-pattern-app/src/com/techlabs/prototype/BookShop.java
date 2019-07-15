package com.techlabs.prototype;

import java.util.ArrayList;
import java.util.List;

public class BookShop implements Cloneable{
	private String shopName;
	private List<Book> books=new ArrayList();
	
	public void addBooks() {
		for(int i=1;i<6;i++) {
			Book book=new Book();
			book.setBookId(i);
			book.setName("Book"+i);
			books.add(book);
		}
	}

	@Override
	public String toString() {
		return "BookShop [shopName=" + shopName + ", books=" + books + "]";
	}

	public String getShopName() {
		return shopName;
	}

	public void setShopName(String shopName) {
		this.shopName = shopName;
	}
	
	@Override
	protected BookShop clone() throws CloneNotSupportedException {
		BookShop bs=new BookShop();
		for(Book b:this.getBooks()) {
			bs.getBooks().add(b);
		}
		return bs;
	}

	public List<Book> getBooks(){
		return books;
	}
	
	
}
