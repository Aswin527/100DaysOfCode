package com.demo.collections;
import java.util.*;

public class BookTestList {

	public static void main(String[] args) {
		ArrayList<Books> b1=new ArrayList<Books>();
		b1.add(new Books(1,"Books",10.2));
		System.out.println(b1);
		for(Books b:b1) {
			System.out.println("["+b.id+","+b.title+","+b.price+"]");
		}
	}

}
