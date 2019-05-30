package com.techlabs.loginform;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class LoginFrame extends JFrame implements ActionListener{
	JLabel l1, l2, l3;
	JTextField tf1;
	JButton btn1;
	JPasswordField p1;
	
	public LoginFrame() {
		JFrame frame = new JFrame("Login Form");
		l1 = new JLabel("Login Form");
		l1.setForeground(Color.blue);

		l2 = new JLabel("Username");
		l3 = new JLabel("Password");
		tf1 = new JTextField();
		p1 = new JPasswordField();
		btn1 = new JButton("Login");
		btn1.addActionListener(this);

		l1.setBounds(100, 30, 400, 30);
		l2.setBounds(80, 70, 200, 30);
		l3.setBounds(80, 110, 200, 30);
		tf1.setBounds(300, 70, 200, 30);
		p1.setBounds(300, 110, 200, 30);
		btn1.setBounds(150, 160, 100, 30);

		frame.add(l1);
		frame.add(l2);
		frame.add(tf1);
		frame.add(l3);
		frame.add(p1);
		frame.add(btn1);

		frame.setSize(400, 400);
		frame.setLayout(null);
		frame.setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent ae)
	 {
	   String uname = tf1.getText();
	   String pass = p1.getText();
	   if(uname.equals("admin") && pass.equals("abc@123"))
	   {   
	      WelcomeFrame wel = new WelcomeFrame();
	      wel.setVisible(true);
	      JLabel label = new JLabel("Welcome "+uname+" !");
	      wel.getContentPane().add(label);
	    }
	    else
	    {
	      JOptionPane.showMessageDialog(this,"Incorrect login or password",
	      "Error",JOptionPane.ERROR_MESSAGE);  
	    }
	  }
		public JLabel getL1() {
			return l1;
		}

		public JLabel getL2() {
			return l2;
		}

		public JLabel getL3() {
			return l3;
		}

		public JTextField getTf1() {
			return tf1;
		}

		public JButton getBtn1() {
			return btn1;
		}

		public JPasswordField getP1() {
			return p1;
		}
}
