package com.techlabs.storageitem.test;

import com.techlabs.storageitem.File;
import com.techlabs.storageitem.Folder;
import com.techlabs.storageitem.IStorageItem;

public class TestStorageItem {

	public static void main(String[] args) {
		IStorageItem item;
	
		Folder f=new Folder("Movies");
		Folder f2=new Folder("Hindi");
		
		File file1=new File(789,"KGF","mp4");
		File file2=new File(1024,"Intersteller","mp4");
		File file3=new File(9665,"ABCD","mp4");
		
		f.addItem(file1);
		f.addItem(file2);
		f.addItem(f2);
		
		
		f.setLevel(0);
		
		f2.setLevel(1);
		f2.addItem(file3);
		
		f.display();
		
	}

}
