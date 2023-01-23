package com.demo.awt.AWTDemo;

import java.awt.*;

public class AWTDemo  extends Frame{
	
	public AWTDemo() {
		Button b=new Button("Click Me");
		b.setBounds(150, 200, 80, 30);
		add(b);
		setSize(400, 400);
		setTitle("Demo Frame");
		setLayout(null);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		AWTDemo a=new AWTDemo();
	}
}
