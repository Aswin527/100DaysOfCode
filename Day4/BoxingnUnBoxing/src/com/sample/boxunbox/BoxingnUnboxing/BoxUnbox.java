package com.sample.boxunbox.BoxingnUnboxing;

public class BoxUnbox {

	public static void main(String[] args) {
		int i=10;
		Integer s=new Integer(i);//Boxing
		System.out.println(s);
		int k=s.intValue();//unBoxing
		System.out.println(k);
		Double j=new Double(23.56);//Boxing
		System.out.println(j);
		
		Integer d=25;//Autoboxing
		int e=(int)d;//Autounboxing
	}

}
