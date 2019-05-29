package com.techlabs.observer.usinglistener;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.AbstractButton;
import javax.swing.JButton;
import javax.swing.JFrame;

public class ButtonEvent extends JFrame implements ActionListener {
	JButton button;
	List<Listener> listeners = new ArrayList<Listener>();

	public ButtonEvent() {
		 button = new JButton("Source");
	     button.addActionListener(this);
	     add(button);
	     
	     setLayout(new FlowLayout());
	     setSize(700,700);
	     setTitle("Window");
	     setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	     setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {

	}

}
