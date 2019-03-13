package com.pds.exp;
import java.io.*;
import java.net.*;
public class Server {
	
	/**
	* @param args
	*/
	public static void main(String[] args) {
	int port=5001;
	try {
	ServerSocket serverSocket=new ServerSocket(port);
	System.out.println("SERVER WAITING");
	Socket clientSocket=serverSocket.accept();
	BufferedReader fromClient=new BufferedReader(new
	InputStreamReader(clientSocket.getInputStream()));

	PrintStream toClient=new PrintStream(clientSocket.getOutputStream());
	while(true)
	{
	int choice=Integer.parseInt(fromClient.readLine());
	System.out.print(choice);
	switch(choice)
	{
	case 1:
	int no=Integer.parseInt(fromClient.readLine());
	int result=1;
	if (no!=0 && no!=1){
	for(int i=2;i<=no;i++)
	result*=i;
	}
	toClient.flush();
	toClient.println(result);
	break;
	case 2:
	break;
	}
	}
	} catch (Exception e) {
	// TODO Auto-generated catch block
	}
	}
	}



