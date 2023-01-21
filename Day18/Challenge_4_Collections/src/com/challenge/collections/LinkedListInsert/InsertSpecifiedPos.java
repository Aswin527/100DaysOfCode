package com.challenge.collections.LinkedListInsert;

import java.util.*;

public class InsertSpecifiedPos {

	public static void main(String[] args) {
		LinkedList<String> list1=new LinkedList<String>();
		
		list1.add("java");
		list1.add("python");
		list1.add("sql");
		list1.add("react");

		System.out.println("Current List:-"+list1);
		System.out.println("Enter the position you want to insert:-");
		Scanner scn=new Scanner(System.in);
		int a=scn.nextInt();
		System.out.println("Enter the Element you want to insert:-");
		String e;
		e=scn.nextLine();
		LinkedList<String> list2=new LinkedList<String>();
		list2.add(e);
		list1.addAll(a, list2);
		
		System.out.println("Updated List:-"+list1);
		
	}

}
