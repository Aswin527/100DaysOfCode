package com.demo.awt.AWTDemo;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EventHandler extends Frame implements ActionListener{
	
	TextField t;
	Button b;
	
	public EventHandler() {
		t=new TextField();
		t.setBounds(100, 100, 100, 20);
		b=new Button("Click Me");
		b.setBounds(120, 150, 50, 20);
		
		b.addActionListener(this);
		
		add(b);
		add(t);
		setSize(300,300);
		setLayout(null);
		setVisible(true);
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		t.setText("Java is Object Oriented");
	}
	
	public static void main(String[] args) {
		new EventHandler();
	}

}
