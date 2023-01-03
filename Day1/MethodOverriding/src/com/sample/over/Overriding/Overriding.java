package com.sample.over.Overriding;

public class Overriding {

	void m1() {
		System.out.println("m1 in Super Class");
	}
	void m2() {
		System.out.println("m2 in Super Class");
	}
	
}

class B extends Overriding{
	@Override
	void m1() {
		System.out.println("m1 in B");
	}	
}

class C extends B{
	void m2() {
		System.out.println("m2 in C");
	}
}
