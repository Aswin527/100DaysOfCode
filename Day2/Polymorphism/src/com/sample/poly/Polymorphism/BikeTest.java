package com.sample.poly.Polymorphism;

public class BikeTest {

	public static void main(String[] args) {
		Rider r1=new Rider();
		Pulser p1=new Pulser();
		r1.ride(p1);//Compile time
		Bike b1=new Bike();
		r1.ride(b1);
		
	}

}
