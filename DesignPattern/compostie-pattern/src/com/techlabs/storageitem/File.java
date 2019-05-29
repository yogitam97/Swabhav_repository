package com.techlabs.storageitem;

public class File implements IStorageItem{
	private float size;
	private String name;
	private String extension;
	
	public File(float size, String name, String extension) {
		this.size = size;
		this.name = name;
		this.extension = extension;
	}

	@Override
	public void display() {
		System.out.println(""+name+" "+size+" "+extension);
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
