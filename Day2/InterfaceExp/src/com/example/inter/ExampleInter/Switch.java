package com.example.inter.ExampleInter;

public interface Switch {
	void on();
	void off();
}

class Fan implements Switch{

	@Override
	public void on() {
		System.out.println("Fan On");
	}

	@Override
	public void off() {
		System.out.println("Fan Off");
	}
	
}

class Bulb implements Switch{

	@Override
	public void on() {
		System.out.println("Bulb On");
	}

	@Override
	public void off() {
		System.out.println("Bulb Off");
	}
	
}
