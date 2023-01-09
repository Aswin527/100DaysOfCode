package com.example.inter.ExampleInter;

public class Tester {

	public static void main(String[] args) {
		
		Switch s=new Fan();
		s.on();
		s.off();
		s=new Bulb();
		s.on();
		s.off();
	}

}
