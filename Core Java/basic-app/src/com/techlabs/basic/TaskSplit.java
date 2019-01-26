package com.techlabs.basic;

public class TaskSplit {

	public static void main(String[] args) {
		String str=args[0];
		String[] arrOfStr = str.split("[,?.@;/& =]+");
		if(str.contains("dev")) {
		for(int i=0;i<arrOfStr.length;i++) {
			if(arrOfStr[i].startsWith("dev"))
				System.out.println("Developer="+arrOfStr[i+1]);
		}
		}
			else 
				System.out.println("No developer found!");
			for(int i=0;i<arrOfStr.length;i++) {
			 if(arrOfStr[i].startsWith("cli")){
				System.out.println("Client="+arrOfStr[i+1]);
			}
			else if(arrOfStr[i].startsWith("www")) {
				System.out.println("Domain="+arrOfStr[i+1]);
			}
	
		}
		}
}