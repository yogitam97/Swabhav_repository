package com.techlabs.prototype;

public class TestBooks {

	public static void main(String[] args) throws CloneNotSupportedException {
		BookShop bookshop=new BookShop();
		bookshop.setShopName("Novelty");
		bookshop.addBooks();
		
		
		BookShop bs=(BookShop) bookshop.clone();
		bs.setShopName("Success");
		bookshop.getBooks().remove(2);
		//bs.addBooks();
		System.out.println(bookshop);
		System.out.println(bs);
	}

}
