package demo.string.vowels.FindVowels;

import java.util.Scanner;

public class FindVowels {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter a String:- ");
		String str;
		str=scn.nextLine();
		int count=0;
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u') {
				count++;
			}
		}
		System.out.println("Number of Vowels Present in above String:-"+count);
		
	}

}
