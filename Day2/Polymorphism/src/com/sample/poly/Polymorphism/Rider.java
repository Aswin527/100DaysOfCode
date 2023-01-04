package com.sample.poly.Polymorphism;

public class Rider {
	void ride(Bike b) {
		System.out.println("Bike ride");
		b.start();//Runtime
	}
	void ride(Pulser p) {
		System.out.println("Pulser Ride");
		p.start();//Runtime
	}
}
