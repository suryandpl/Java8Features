package com.uber;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ArrayNthLargestNumber {

	static void findNthLargest(int[] arr) {
		int temp;
		int length = arr.length;
		for(int i=0;i<length;i++) {
			for(int j=i+1;j<length;j++) {
				if(arr[i]>arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println(arr[arr.length-1]);
		
		Arrays.sort(arr);
		System.out.println(arr[arr.length-1]);
		
		
		List<Integer> l = Arrays.stream(arr).sorted().boxed().collect(Collectors.toList());
		System.out.println(l.get(l.size()-1));
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,4,5,6,7,9,8};	
		findNthLargest(arr);
	}

}
