package com.demo.rmvword.RemoveWord;

import java.util.Scanner;

public class RmWord {
	public static void main(String[] args) {
	Scanner scn=new Scanner(System.in);
	System.out.println("Enter a String:- ");
	String str;
	str=scn.nextLine();
    String word = "and";
    str = str.replaceAll(word, "");

    System.out.print(str);
	}
}
