package com.techlabs.storageitem;

import java.util.ArrayList;
import java.util.List;

public class Folder implements IStorageItem{
	private String name;
	private static int spaces=0;
	private int level;
	private List<IStorageItem> items=new ArrayList();
	
	public Folder(String name) {
		this.name = name;
	}
	public void addItem(IStorageItem item) {
		items.add(item);
	}
	public void setLevel(int level) {
		this.level=level;
	}

	@Override
	public void display() {
		if(level==0) {
			spaces=8;
		}
		if(level==1) {
			spaces=16;
		}
		for(int i=0;i<spaces;i++) {
			System.out.print(" ");
		}
		System.out.println(" "+name);
		for(IStorageItem item:items) {
				item.display();
		}
	}
	public String getName() {
		return name;
	}

	public List<IStorageItem> getItems() {
		return items;
	}

}
