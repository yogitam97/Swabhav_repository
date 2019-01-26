package com.file.writeException;

import java.io.*;

public class WriteFile {

	public static void main(String[] args) throws Exception {
		String s = " This line will be written in file";
		String s2="New line added to the file";
		FileWriter outFile = new FileWriter("write.txt",true);
		BufferedWriter bWriter = new BufferedWriter(outFile);

		bWriter.write(s);
		bWriter.write(s2);
		bWriter.close();

	}

}
