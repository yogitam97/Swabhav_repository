package com.techlabs.service;
import java.io.IOException;

import java.io.PrintWriter;
import java.io.File;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Service {

		FileReader fr;
		File f;
		FileWriter fw;
		PrintWriter pw=null;
		private String data[];
		Scanner sc = new Scanner(System.in);
		private String st, ss = "";

		public void displayBookmark() throws IOException {
			f = new File("C:\\Users\\SANJAY\\Desktop\\bookmarks.html");
			fr = new FileReader(f);
			fw=new FileWriter("C:\\Users\\SANJAY\\Desktop\\bookmarks.html",true);
			BufferedReader br = new BufferedReader(fr);
			pw = new PrintWriter(fw);

			while ((st = br.readLine()) != null) {
				ss = ss + st;
			}
			br.close();
			splitData();

		}

		public void userMenu() throws IOException {
			int c = 0;
			boolean ch = true;

			while (ch) {
				System.out.println("Please Enter your coice " + "\n 1)Display BookMarks" + "\n 2)Add BookMark"
						+ " \n 3)FilePath" + " \n 4)exit\n ");
				c = sc.nextInt();
				switch (c) {
				case 1:
					actualBookmark();
					break;
				case 2:
					System.out.println("Enter bookmark name:");
					String name = sc.next();
					System.out.println("Enter bookmark website:");
					String url = sc.next();
					add(name, url);
					break;
				case 3:
					filePath();
					break;
				case 4:
					System.out.println("Thank you!");
					ch = false;
					break;
				default:
					System.out.println("Invalid Input");
				}

			}
		}

		public void add(String url, String domain) throws IOException {
			String addUrl = "<p><A HREF=\"https://" + url + "\"" + ">" + domain + "</A><br/></p>";
			pw.println("\n" + addUrl);
			pw.close();
		}

		public void display() {

		}

		public String splitURL(String name) {
			String[] value = name.split("[.]");
			return value[1];
		}

		public void filePath() {
			System.out.println("\nLocation of file is : " + f.getPath() + "\n");

		}

		public void splitData() {
			data = ss.split("[,?.@;/':]+");
		}

		public void actualBookmark() {

			for (int index = 0; index < data.length; index++)
				if (data[index].contains("http")) {
					System.out.println(data[index + 1] + "." + data[index + 2] + "." + data[index + 3]);

				}
			System.out.println("");
		}
	}



