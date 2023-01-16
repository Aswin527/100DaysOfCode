package com.demo.muti;
import java.util.*;

public class RunnableTest {
	public static void main(String[] args) {
		System.out.println("Main Start");
		Runnable r=new RunnableInterface();
		Thread t=new Thread(r);
		t.start();
		for(int i=0;i<20;i++) {
			System.out.println(i);
		}
		System.out.println("Main End");
	}
}
