package com.test;

public class ArrayPairs {

	static void findOptimalPairs(int arr[]) {
		int length = arr.length;
		
		for(int i=0,j=length-1;i< length;i++,j--) {
			System.out.println("("+arr[i]+","+arr[j]+")");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,3,4,5};
		findOptimalPairs(arr);
	}

}
