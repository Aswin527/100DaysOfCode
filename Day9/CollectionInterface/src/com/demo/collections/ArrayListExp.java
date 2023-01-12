package com.demo.collections;
import java.util.*;

public class ArrayListExp {

	public static void main(String[] args) {
		ArrayList a=new ArrayList<>();
		
		System.out.println(a.size());
		a.add(25);
		a.add("java");
		a.add("array");//adding objects
		a.add("Test");
		a.add(1,10);//adding objects (index,object)
		
		System.out.println(a.size());
		
		System.out.println(a);
		
	}

}
