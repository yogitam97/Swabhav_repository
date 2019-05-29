package com.techlabs.storageitem.test;

import com.techlabs.storageitem.File;
import com.techlabs.storageitem.Folder;
import com.techlabs.storageitem.IStorageItem;

public class TestStorageItem {

	public static void main(String[] args) {
		IStorageItem item;
		Folder f=new Folder("Movies");
		Folder f2=new Folder("Hindi");

		f.addItem(new File(789,"KGF","mp4"));
		f.addItem(new File(1024,"Intersteller","mp4"));
		
		f2.addItem(new File(9665,"ABCD","mp4"));
		f.addItem(f2);
		
		f.display();
		
	}

}
