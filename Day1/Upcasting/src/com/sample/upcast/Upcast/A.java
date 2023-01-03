package com.sample.upcast.Upcast;

public class A {
	void test1() {
		System.out.println("test1 in A");
	}
}
class B extends A{
	void test2() {
		System.out.println("test2 in B");
	}
}
class C extends A{
	void test3() {
		System.out.println("test3 in C");
	}
}
