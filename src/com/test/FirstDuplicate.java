package com.test;

import java.util.HashSet;
import java.util.Set;

public class FirstDuplicate {

	//Solution for integer array
	static int firstDuplicateInt(int[] a) {
		Set<Integer> set = new HashSet<Integer>();
		for(int i:a) {
			if(set.contains(i)){
				return i;
			}
			set.add(i);
		}
		return -1;
	}
	//Solution for the first duplicate character in the given string
	static char firstDuplicateChar(String s) {
		Set<Character> set = new HashSet<Character>();
		for(int i=0;i<s.length();i++) {
			if(set.contains(s.charAt(i))){
				return s.charAt(i);
			}
			set.add(s.charAt(i));
		}
		return '-';
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr ={1,2,3,4,1};
		System.out.println(firstDuplicateInt(arr));
		String s = "suryakumar";
		System.out.println(firstDuplicateChar(s));
	}

}
