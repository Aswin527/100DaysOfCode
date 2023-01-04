package com.example.inter.ExampleInter;

public interface Phone {
	void on();
	void dial();
}

class Pixel {
	void on() {
		System.out.println("Pixel On");
	}
}

class Oneplus extends Pixel implements Phone{

	@Override
	public void dial() {
		System.out.println("Oneplus Dial");
		
	}
	@Override
	public void on() {
		System.out.println("Oneplus On");
	}
	
}
