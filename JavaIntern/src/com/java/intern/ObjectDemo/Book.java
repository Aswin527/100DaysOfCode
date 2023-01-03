package com.java.intern.ObjectDemo;
//Create a class for Book
public class Book {
	String title;
	String author;
	double price;
	//Create a Parameterized constructor for assigning the value to the variables. 
	Book(String t,String a,double p){
		title=t;
		author=a;
		price=p;
	}
	
	//Creating a method to display the book details
	void display() {
		System.out.println("Title of the Book:-"+title);
		System.out.println("Author of the Book:-"+author);
		System.out.println("Price of the Book:-"+price);
	}
}
