package com.sample.tostr.ToStr;

public class A {
	
	int pages;
	int price;
	
	public A(int pages,int price) {
		this.pages=pages;
		this.price=price;
	}
	@Override
	public String toString() {
		return "Book[pages:-"+pages+", price:-"+price+"]";
		
	}
}
