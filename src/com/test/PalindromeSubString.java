package com.test;

import java.util.HashSet;
import java.util.Set;

public class PalindromeSubString {
	
	public static void expand(String s,int low,int high,Set<String> set) {
		while(low>=0 && high < s.length() && s.charAt(low)==s.charAt(high)) {
			set.add(s.substring(low, high+1));
			//System.out.println(s.substring(low, high+1));
			low--;
			high++;
		}
	}
	public static void findAllSubstringPalindrom(String s) {
		int length = s.length();
		if(s==null || length<1) System.out.println("String is empty");
		if(length<2)System.out.println(s);
		Set<String> set = new HashSet<String>();
		for(int i=0;i<length;i++) {
			//find all odd length palindrome with str[i] as mid point
			expand(s,i,i,set);
			//find all  length palindrome with str[i] and str[i+1]
			expand(s,i,i+1,set);
		}
		System.out.println(set);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "google";
		findAllSubstringPalindrom(str);
	}

}
