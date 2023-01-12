package com.demo.collections;

public class Books implements Comparable<Books> {
	int id;
	String title;
	double price;
	Books(int id,String title,double price) {
		this.id=id;
		this.title=title;
		this.price=price;
	}
	@Override
	public int compareTo(Books o) {
		// TODO Auto-generated method stub
		return 0;
	}
}
