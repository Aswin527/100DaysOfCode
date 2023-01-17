package com.demo.sync.SyncronizationDemo;

public class Table {
	synchronized void printTable(int n) {
		for(int i=1;i<=5;i++) {
			System.out.println(i*n);
		}
		try {
			Thread.sleep(20);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
