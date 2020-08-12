package com.test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ArrayNthLargest {
	//Solution 1
	static void nthLargest(int[] arr) {
		int temp;
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
				
		}
		System.out.println(arr[arr.length-3]);
		
		//Solution 2 :By using sorting
		Arrays.sort(arr);
		System.out.println(arr[arr.length-3]);
		
		//Solution 3 :By using collections
		List<Integer> l =  Arrays.stream(arr).sorted().boxed().collect(Collectors.toList());
		System.out.println(l.get(l.size()-3));
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {9,2,1,7,8,3};
		nthLargest(a);
	}

}
