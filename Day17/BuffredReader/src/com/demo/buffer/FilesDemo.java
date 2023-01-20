package com.demo.buffer;

import java.io.BufferedInputStream;
import java.io.FileInputStream;

public class FilesDemo {
	public static void main(String[] args) {
		try {
			FileInputStream fi=new FileInputStream("D:/Coding Playground/Java Internship/Test.txt");
			BufferedInputStream b=new BufferedInputStream(fi);
			String s="Java is a language";
			int i;
			while ((i=b.read())!=-1) {
				System.out.println((char)i);
			}
			b.close();
			fi.close();
			
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
