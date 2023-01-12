package com.demo.stringfun.StringBuffBuil;

public class StringBuffDemo {

	public static void main(String[] args) {
		String n=new String("Aswin");
		System.out.println(n.hashCode());
		n="Ramesh";
		System.out.println(n.hashCode());
		n=n+"java";
		System.out.println(n.hashCode());
		StringBuilder sb=new StringBuilder("Aswin");
		System.out.println(sb.hashCode());
		sb.append("Ramesh");
		System.out.println(sb.hashCode());
	}

}
