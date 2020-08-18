package com.test;

import java.util.Arrays;

public class SortedSquareArray {
	
	//Solution1 : By using Arrays Sort
	public static void sortedSquare(int[] arr) {
		int[] result = new int[arr.length];
		for(int i=0;i<arr.length;i++) {
			result[i] = arr[i]*arr[i];
		}
		Arrays.sort(result);
		System.out.println(Arrays.toString(result));
	}

	//Solution2 : Without using Arrays Sort 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {13,5,7,-9,-2,-7};
		sortedSquare(arr);
	}

}
