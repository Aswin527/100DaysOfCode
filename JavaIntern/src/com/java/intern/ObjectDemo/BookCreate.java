package com.java.intern.ObjectDemo;

import java.util.Scanner;

public class BookCreate {
	//Crating a method to read book details with return type as the object of Book
	Book createNewBook() {
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter the name of the book:- ");
		String t=scn.next();
		System.out.println("Enter the name of author of the book:- ");
		String a=scn.next();
		System.out.println("Enter the price of the book:- ");
		double p=scn.nextDouble();
		//returning the object 
		return new Book(t,a,p);
	}
	
}
