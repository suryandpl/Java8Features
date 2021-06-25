package com.uber;

public class ArrayMissingNumber {

	static int findMissingNumber(int[] arr) {
		int length = arr.length;
		int sum = (arr[length-1]*(arr[length-1]+1))/2;
		for(int i=0;i<length;i++) {
			sum-=arr[i];
		}
		return sum;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,3,5};
		int missingNumber = findMissingNumber(arr);
		System.out.println("Missed Number from the array is :"+missingNumber);
		
	}

}
