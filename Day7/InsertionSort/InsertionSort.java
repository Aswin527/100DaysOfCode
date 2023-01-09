package com.challenge.array.InsertionSort;

import java.lang.reflect.Array;
import java.util.Arrays;

public class InsertionSort {

	public static void main(String[] args) {
		int[] arr1 = {9,14,3,2,43,11,58,22};
		 int n = arr1.length;  
	        for (int j = 1; j < n; j++) {  
	            int key = arr1[j];  
	            int i = j-1;  
	            while ( (i > -1) && ( arr1 [i] > key ) ) {  
	            	arr1 [i+1] = arr1 [i];  
	                i--;  
	            }  
	            arr1[i+1] = key;  
	        }
	        
	     System.out.println(Arrays.toString(arr1));
	}

}
