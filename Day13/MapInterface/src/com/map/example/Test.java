package com.map.example;

import java.util.*;

public class Test {

	public static void main(String[] args) {
		HashMap<String,Integer> m1=new HashMap<String,Integer>();
		
		m1.put("Java", 12);
		m1.put("python", 24);
		m1.put("react", 78);
		m1.put("kotlin", 15);
		
		System.out.println(m1);
		System.out.println(m1.size());
		System.out.println(m1.get("kotlin"));
		System.out.println(m1.keySet());
		
		//Iterator
		
		Iterator<String> it=m1.keySet().iterator();
		
		while(it.hasNext()) {
			String key=it.next();
			int value=m1.get(key);
			System.out.println(key+"="+value);
		}
		
		Hashtable<String,Integer> m2=new Hashtable<String,Integer>();
		
		m2.put("Java", 12);
		m2.put("python", 24);
		m2.put("react", 78);
		m2.put("kotlin", 15);
		
		System.out.println(m2);
	}

}
