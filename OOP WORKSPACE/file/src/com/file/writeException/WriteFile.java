package com.file.writeException;

import java.io.*;

public class WriteFile {

	public static void main(String[] args) throws Exception {
		String s = " This line will be written in File";
		FileWriter outFile = new FileWriter("write.txt");
		BufferedWriter bWriter = new BufferedWriter(outFile);

		bWriter.write(s);
		bWriter.close();

	}

}
