package com.techlabs.buttons.using.framework;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class CommonObserver implements ActionListener {
	Window window;

	public CommonObserver(Window w) {
		this.window = w;
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		if (e.getSource() == window.getRed()) {
			window.getContentPane().setBackground(Color.RED);
			System.out.println("Button " + e.getActionCommand() + " is clicked");

		}
		if (e.getSource() == window.getBlue()) {
			window.getContentPane().setBackground(Color.BLUE);
			System.out.println("Button " + e.getActionCommand() + " is clicked");
		}

	}
}
