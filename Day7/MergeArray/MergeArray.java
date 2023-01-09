package com.challenge.array.MergeArray;

import java.util.Arrays;
import java.util.Scanner;

public class MergeArray {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		
		System.out.println("Enter the Size of first array:-");
		int fl=scn.nextInt();
		int[] firstArray = new int[fl];
		System.out.println("Enter elements of first array:-");
		for(int i=0;i<firstArray.length;i++) {
			firstArray[i]=scn.nextInt();
		}
		
		System.out.println("Enter the Size of second array:-");
		int sl=scn.nextInt();
		int[] secondArray = new int[sl];
		System.out.println("Enter elements of second array:-");
		for(int i=0;i<firstArray.length;i++) {
			secondArray[i]=scn.nextInt();
		}
		
		int rl = firstArray.length + secondArray.length;  
		int[] mergedArray = new int[rl];  
		int pos = 0;  
		for (int i=0;i<firstArray.length;i++)  
		{  
			mergedArray[pos] = firstArray[i];  
			pos++;  
		}  
		for (int i=0;i<secondArray.length;i++)
		{  
			mergedArray[pos] = secondArray[i];  
			pos++;  
		}  
		System.out.println(Arrays.toString(mergedArray));  
		}  
	}


