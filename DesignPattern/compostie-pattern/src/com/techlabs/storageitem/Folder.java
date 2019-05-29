package com.techlabs.storageitem;

import java.util.ArrayList;
import java.util.List;

public class Folder implements IStorageItem{
	private String name;
	private List<IStorageItem> items=new ArrayList();
	
	public Folder(String name) {
		this.name = name;
	}
	public void addItem(IStorageItem item) {
		items.add(item);
	}

	@Override
	public void display() {
		System.out.println(" "+name);
		for(IStorageItem item:items) {
			System.out.print("----->");
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
