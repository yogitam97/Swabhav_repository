package com.pds.exp;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
public class Client {
	
	public static void main(String[] args) {
	int port=5001;
	try {
	Socket clientSocket=new Socket("localhost",port);
	System.out.println("Client Started");
	InputStreamReader isr = new InputStreamReader(System.in);
	BufferedReader br = new BufferedReader(isr);
	PrintStream toServer=new PrintStream(clientSocket.getOutputStream());
	BufferedReader fromServer=new BufferedReader(new
	InputStreamReader(clientSocket.getInputStream()));


	String menu="SOCKET PROGRAMMING MENU\n1.FACTORIAL\n2.EXIT\nENTER UR CHOICE";
	int choice=-1;
	do
	{
	toServer.flush();
	System.out.println(menu);
	choice=Integer.parseInt(br.readLine());
	toServer.println(choice);
	toServer.flush();
	switch(choice)
	{
	case 1:
	System.out.println("ENTER A NO:");
	int no=Integer.parseInt(br.readLine());
	toServer.println(no);
	int result=Integer.parseInt(fromServer.readLine());
	System.out.println("FACTORIAL IS:"+result);
	break;
	case 2:
	break;
	default:
	System.out.println("INVALID CHOICE");
	}
	}while(choice!=4);
	} catch (Exception e) {
	// TODO Auto-generated catch block
}}
	}

