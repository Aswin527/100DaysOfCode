package com.demo.lambda;

public class LambdaExample {
	public static void main(String[] args) {
		A obj;
		obj=() -> {System.out.println("Hello world");};//Lambda Expression
		obj.show();
	}
}

@FunctionalInterface
interface A{
	void show();
}

class Test implements A{
	@Override
	public void show() {
		System.out.println("Hello");
	}
}
