package com.demo.sync.SyncronizationDemo;

public class Thread2 extends Thread{

	Table t;
	
	public Thread2(Table t) {
		super();
		this.t = t;
	}

	@Override
	public void run() {
		t.printTable(100);
	}
}
