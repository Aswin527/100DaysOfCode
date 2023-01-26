package com.demo.swing;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class LoginPage {
	public static void main(String[] args) {
		JFrame f=new JFrame("Login Page");
		
		JLabel un=new JLabel("Username");
		un.setBounds(20, 50, 100, 50);
		
		JTextField unt=new JTextField();
		unt.setBounds(120, 60, 120, 30);
		
		JLabel pwd=new JLabel("Password");
		pwd.setBounds(20, 90, 100, 50);
		
		JPasswordField pf=new JPasswordField();
		pf.setBounds(120, 100, 120, 30);
		
		JButton login=new JButton("Login");
		login.setBounds(20,150,80,30);
		
		
		
		login.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String uname=unt.getText();
				String pass= new String(pf.getPassword());
				
				System.out.println("Username="+uname+"Password="+pass);
			}
		});
		
		f.add(un);
		f.add(unt);
		f.add(pwd);
		f.add(pf);
		f.add(login);
		
		f.setSize(500, 500);
		f.setLayout(null);
		f.setVisible(true);
		
	}
}
