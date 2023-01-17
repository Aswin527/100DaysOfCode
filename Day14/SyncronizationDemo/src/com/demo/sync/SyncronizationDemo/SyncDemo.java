package com.demo.sync.SyncronizationDemo;

public class SyncDemo {

	public static void main(String[] args) {
		Table t1=new Table();
		Thread1 th1=new Thread1(t1);
		Thread2 th2=new Thread2(t1);
		th1.start();
		th2.start();
	}

}
