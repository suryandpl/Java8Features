package com.test;

import java.util.Arrays;

public class BinarySearch {
	
	static int binarySearch(int arr[],int ele) {
		int left=0, right=arr.length-1;
		
		while(left<=right) {
			int mid = left+(right)/2;
			if(arr[mid]==ele) return mid;
			
			//if ele is greater, ignore left half
			if(arr[mid]<ele) left=mid+1;
			
			//if ele is smaller, ignoring right half
			if(arr[mid]>ele) right=mid-1;
			
			
		}
		return -1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {16,8,2,10,11,14};
		Arrays.sort(arr);
		int index = binarySearch(arr,16);
		System.out.println("element index : "+index);
	}

}
