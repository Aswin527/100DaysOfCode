package com.iterator.example;
import java.util.*;

public class Iterator2 {
	public static void main(String[] args) {
		
	ArrayList a=new ArrayList();
	
	a.add(34);
	a.add(43);
	a.add(22);
	a.add(43);
	
	ListIterator li=a.listIterator();
	while(li.hasNext()) {
		System.out.println(li.next());
	}
	System.out.println("");
	
	while(li.hasPrevious()) {
		System.out.println(li.previous());
	}
	}
}
