package com.techlabs.storageitem;

public class File implements IStorageItem{
	private float size;
	private String name;
	private String extension;
	private int level;
	private static int spaces=0;
	
	public File(float size, String name, String extension) {
		this.size = size;
		this.name = name;
		this.extension = extension;
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
		for(int i=0;i<spaces;i++)
			System.out.print(" ");
		System.out.println("----->"+name+" "+size+" "+extension);
	}
	public float getSize() {
		return size;
	}

	public String getName() {
		return name;
	}

	public String getExtension() {
		return extension;
	}

}
