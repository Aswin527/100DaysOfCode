package com.demo.muti;

public class RunnableInterface implements Runnable{

	@Override
	public void run() {
		System.out.println("Runnable start");
		for(char i='a';i<='z';i++) {
			System.out.println(i);
		}
		System.out.println("Runnable end");
	}

}
