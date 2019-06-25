package com.techlabs.asynchronous;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class UIasyncronous extends JFrame implements ActionListener,Runnable {
	private JButton alert, print;
	

	public UIasyncronous() {
		alert = new JButton("Alert");
		alert.addActionListener(this);
		add(alert);

		print = new JButton("Print");
		print.addActionListener(this);
		add(print);

		setLayout(new FlowLayout());
		setSize(500, 500);
		setTitle("Frame");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == this.alert) {
			JOptionPane.showMessageDialog(this, "Hello!!!");
		}
		if (e.getSource() == this.print) {
			
			Thread thread=new Thread(this);
			thread.start();
			}
		
	}

	public JButton getAlert() {
		return alert;
	}

	public JButton getPrint() {
		return print;
	}

	@Override
	public void run() {
		while (true) {
			Date date = new Date();
			SimpleDateFormat formatter = new SimpleDateFormat("dd-M-yyyy hh:mm:ss");  
			String strDate = formatter.format(date);
			System.out.println(strDate);
		}
	}

	

}

