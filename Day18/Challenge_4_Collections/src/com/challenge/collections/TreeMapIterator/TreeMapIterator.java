package com.challenge.collections.TreeMapIterator;

import java.util.Iterator;
import java.util.TreeMap;

public class TreeMapIterator {

	public static void main(String[] args) {
		
		TreeMap<Integer, String> tm=new TreeMap<Integer,String>();
		
		tm.put(54, "Java");
		tm.put(34, "Spring");
		tm.put(23, "Springboot");
		tm.put(14, "Hibernate");
		
		Iterator<Integer> it= tm.keySet().iterator();
		
		while (it.hasNext()) {
			int key=(int) it.next();
			System.out.println(key+"="+tm.get(key));
		}
	}

}
