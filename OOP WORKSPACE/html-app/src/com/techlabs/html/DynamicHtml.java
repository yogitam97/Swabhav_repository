package com.techlabs.html;

import java.io.*;

public class DynamicHtml {
	public static void main(String[] args) throws Exception {
		try {
			File file = new File("world.html");

			if (file.createNewFile())

				try {

					FileWriter fw = new FileWriter("world.html", true);
					fw.write("<html>");
					fw.write("<body>");
					fw.write("<h1>hello-World</h1>");
					fw.write("</body>");
					fw.write("<html>");
					fw.close();
				} catch (IOException e) {
					e.printStackTrace();
				}

			System.out.println("FIle is Created SucessFully");
		} catch (IOException ioe) {
			ioe.printStackTrace();
		}

	}
}
