package com.sample.upcast.Upcast;

public class Test {
	public static void main(String[] args) {
		B b1=new B();
		b1.test1();
		b1.test2();
		A a=new B();//Up casting
		a.test1();
	}
}
