package com.demo.swings;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class SwingsDemo {
	public static void main(String[] args) {
		JFrame f=new JFrame();
		JButton b=new JButton("Click Here");
		b.setBounds(120,100,100,20);
		
		JTextField t=new JTextField();
		t.setBounds(120,150,200,20);
		
		b.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				t.setText("Hello World");
				
			}
		});
		
		f.add(b);
		f.add(t);
		
		f.setSize(400, 400);
		f.setLayout(null);
		f.setVisible(true);
	}
}
