package com.challenge.array.InsertElement;

import java.util.*;

public class InsertNewElement {

	public static void main(String[] args) {
		int size,index,ele;
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter the size of the array:-");
		size=scn.nextInt();
		int a[]=new int[size];
		int new_a[]=new int[size+1];
		System.out.println("Enter the array elements:-");
		for(int i=0;i<a.length;i++) {
			a[i]=scn.nextInt();
		}
		
		System.out.println("Enter the elemet you want to insert:-");
		ele=scn.nextInt();
		
		System.out.println("Enter the index you want to insert (should be less than "+(a.length)+"):-");
		index=scn.nextInt();
		
		for(int j=0;j<new_a.length;j++) {
			if(j<index-1) {
				new_a[j]=a[j];
			}else if(j==index-1) {
				new_a[j]=ele;
			}else {
				new_a[j]=a[j-1];
			}
		}
		
		System.out.println("Result:-"+Arrays.toString(new_a));
	}

}
