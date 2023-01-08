package com.demo.remove.FirstLast;

import java.util.Scanner;

public class RmFirstLast {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter a String:- ");
		String str;
		str=scn.nextLine();
		System.out.print(removeFirstandLast(str));
	}
	public static String removeFirstandLast(String str)
    {
        str = str.substring(1, str.length() - 1);
        return str;
    }
}
