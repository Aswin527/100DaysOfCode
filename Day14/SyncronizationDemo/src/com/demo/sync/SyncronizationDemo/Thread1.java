package com.demo.sync.SyncronizationDemo;

public class Thread1 extends Thread{
	
	Table t;
	
	public Thread1(Table t) {
		super();
		this.t = t;
	}

	@Override
	public void run() {
		t.printTable(5);
	}
}
