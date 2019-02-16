package com.techlabs.business;

import java.io.IOException;

import com.techlabs.service.Service;

public class Bookmark_console {

	public static void main(String[] args) throws IOException {
		
		Service service = new Service();
		service.displayBookmark();
		service.userMenu();
	}
}
