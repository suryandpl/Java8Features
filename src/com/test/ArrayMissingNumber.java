package com.test;

public class ArrayMissingNumber {

	static int missingNumber(int a[]) {
		int length = a.length;
		int sum=(a[length-1]*(a[length-1]+1))/2;
		for(int i=0;i<length;i++) {
			sum -=a[i];
		}
		return sum;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,3,5};
		System.out.println(missingNumber(arr));
	}

}
