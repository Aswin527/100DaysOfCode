package com.challenge.array.BinarySearch;

public class BinarySearchArray {

	public static void main(String[] args) {
		int a[]= {20,30,50,78,29};
		int ele=50;
		int last=a.length-1;
		binarySearch(a, 0, last, ele);
		
	}
	public static void binarySearch(int a[],int first,int last,int ele) {
			int mid=(first+last)/2;
			while(first<=last) {
				if(a[mid]<ele) {
					first=mid+1;
				}else if(a[mid]==ele) {
					System.out.println("Element fond at index:-"+mid);
					break;
				}else {
					last=mid-1;
				}
			}
			if(first>last) {
				System.out.println("Element not Found!");
			}
	}
	

}
