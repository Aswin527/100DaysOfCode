package com.challenge.collections.HashMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.TreeMap;

public class SortHashMap {
	public static void main(String[] args) {
		HashMap<Integer, String> hm=new HashMap<Integer,String>();
		
		hm.put(32, "java");
		hm.put(23, "android");
		hm.put(43, "kotlin");
		hm.put(15, "flutter");
		
		Iterator<Integer> it= hm.keySet().iterator();
		System.out.println("Before Sorting\n");
		while(it.hasNext()) {
			int key=(int)it.next();
			System.out.println(key+"="+hm.get(key));
		}
		System.out.println("\n");
		
		TreeMap<Integer, String> tm=new TreeMap<Integer,String>(hm);
		
		Iterator<Integer> it1= tm.keySet().iterator();
		
		System.out.println("After Sorting\n");
		
		while (it1.hasNext()) {
			int key = (int) it1.next();
			System.out.println(key+"="+tm.get(key));
		}
	}
}
