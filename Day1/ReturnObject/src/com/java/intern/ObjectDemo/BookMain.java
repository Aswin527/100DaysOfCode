package com.java.intern.ObjectDemo;

public class BookMain {

	public static void main(String[] args) {
		//Crating object of BookCreate
		BookCreate bc=new BookCreate();
		//Storing the output of createNewBook method to the object of Book Class 
		Book b=bc.createNewBook();
		//Calling display method with object of Book Class.
		b.display();

	}

}
