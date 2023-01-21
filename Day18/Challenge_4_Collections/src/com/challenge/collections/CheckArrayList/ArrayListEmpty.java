package com.challenge.collections.CheckArrayList;

import java.util.ArrayList;

public class ArrayListEmpty {

	public static void main(String[] args) {
		ArrayList a=new ArrayList<>();
		
		if(a.isEmpty()) {
					System.out.println("ArrayList is empty!");
				}
		a.add("java");
		a.add("python");
		a.add("react");
		a.add("dart");
		if(!a.isEmpty()) {
			System.out.println("ArrayList Contains Objects!");
		}
	}

}
