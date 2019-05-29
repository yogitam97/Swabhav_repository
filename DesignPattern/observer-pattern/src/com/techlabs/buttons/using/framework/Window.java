package com.techlabs.buttons.using.framework;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Window extends JFrame {
	private JButton red, blue;
	private CommonObserver cb;

	public Window() {
		cb = new CommonObserver(this);

		red = new JButton("red");
		red.addActionListener(cb);
		add(red);

		blue = new JButton("blue");
		blue.addActionListener(cb);
		add(blue);

		setLayout(new FlowLayout());
		setSize(500, 500);
		setTitle("Window");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);

	}

	public JButton getRed() {
		return red;
	}

	public JButton getBlue() {
		return blue;
	}

	public CommonObserver getCb() {
		return cb;
	}

}