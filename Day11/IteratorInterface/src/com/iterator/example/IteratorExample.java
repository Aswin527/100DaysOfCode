package com.iterator.example;
import java.util.*;

public class IteratorExample {

	public static void main(String[] args) {
		ArrayList a=new ArrayList();
		
		a.add("java");
		a.add("python");
		a.add("php");
		a.add("recat");
		
		Iterator aIt=a.iterator();
		
		while(aIt.hasNext())
			System.out.println(aIt.next());

	}

}
