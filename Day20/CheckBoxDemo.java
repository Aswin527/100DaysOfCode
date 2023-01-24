package com.demo.awt.AWTDemo;

import java.awt.Button;
import java.awt.Choice;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CheckBoxDemo implements ActionListener{
	public CheckBoxDemo() {
		Frame f=new Frame("Checkbox Demo");
		Label l=new Label();
		l.setAlignment(Label.CENTER);
		l.setSize(200, 200);
		Button b=new Button("Show");
		b.setBounds(200, 100, 50, 25);
		Choice c=new Choice();
		c.add("Java");
		c.add("Spring");
		c.add("Springboot");
		c.add("SQL");
		c.setBounds(200,150,60,25);
		f.add(l);
		f.add(b);
		f.add(c);
		
		f.setSize(500, 500);
		f.setLayout(null);
		f.setVisible(true);
		
	}
	public static void main(String[] args) {
		new CheckBoxDemo();
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}
