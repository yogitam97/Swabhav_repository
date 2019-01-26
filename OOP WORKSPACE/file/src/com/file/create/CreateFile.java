package com.file.create;

import java.io.*;

public class CreateFile {

	public static void main(String[] args) throws Exception {
		File f = new File("write.txt");
		f.createNewFile();
	}

}
