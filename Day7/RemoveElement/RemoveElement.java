package com.challenge.array.RemoveElement;

import java.util.*;

public class RemoveElement {

	public static void main(String[] args) {
		
		
		int index;
		System.out.println("Enter the Index to be removed:- ");
		Scanner scn=new Scanner(System.in);
        index=scn.nextInt();
		int[] arr = { 1, 2, 3, 4, 5 };
		
		int[] anotherArray = new int[arr.length - 1];
		 
        for (int i = 0, k = 0; i < arr.length; i++) {
            if (i == index) {
                continue;
            }
            anotherArray[k++] = arr[i];
        }
        
        System.out.println(Arrays.toString(anotherArray));
	}

}
