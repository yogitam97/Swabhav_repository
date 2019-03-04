package com.techlabs.contact.service;

import java.io.BufferedReader;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Service {
	FileReader fr;
	File f;
	FileWriter fw;
	PrintWriter pw = null;
	int count = 0;

	public void add(String contactNo, String email, String name) throws IOException {
		fw = new FileWriter("C:\\Users\\SANJAY\\Desktop\\contacts.csv", true);
		pw = new PrintWriter(fw);
		String addContact = "  " + contactNo + " , " + email + " , " + name + "  ";
		pw.println("\n" + addContact);
		pw.close();
	}

	public String[] display() throws IOException {
		String arr[] = new String[count];
		int i = 0;
		f = new File("C:\\Users\\SANJAY\\Desktop\\contacts.csv");
		fr = new FileReader(f);
		BufferedReader br = new BufferedReader(fr);
		String st;
		while ((st = br.readLine()) != null) {
			arr[i] = st;
			i++;
			st = br.readLine();
		}

		br.close();
		return arr;
	}

	public int NumberOfLines() throws IOException {
		String st;
		f = new File("C:\\Users\\SANJAY\\Desktop\\contacts.csv");
		fr = new FileReader(f);
		BufferedReader br = new BufferedReader(fr);
		while ((st = br.readLine()) != null) {
			count++;
			st = br.readLine();
		}
		System.out.println("number of lines:" + count);
		return count;

	}

	public String Search(String name) throws IOException {
		String arr[] = new String[count];
		int i = 0;
		f = new File("C:\\Users\\SANJAY\\Desktop\\contacts.csv");
		fr = new FileReader(f);
		BufferedReader br = new BufferedReader(fr);
		String st;
		while ((st = br.readLine()) != null) {
			arr[i] = st;
			i++;
			st = br.readLine();
			if (!st.contains(name)) {
				return name;
			}
		}
		br.close();
		return name;
	}

}
