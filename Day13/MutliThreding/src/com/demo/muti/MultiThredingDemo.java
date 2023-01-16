package com.demo.muti;

public class MultiThredingDemo {
	public static void main(String[] args) {
		System.out.println("Main method started..");
		Thread t=new PrintChars();
		t.start();
		for(int j=0;j<20;j++) {
			System.out.println(j);
		}
		System.out.println("Main method ended..");
	}
}

class PrintChars extends Thread{
	@Override
	public void run() {
		System.out.println("Run method printing started....");
		for(char i='a';i<='z';i++) {
			System.out.println(i);
		}
		System.out.println("Run method printing ended....");
	}
}

