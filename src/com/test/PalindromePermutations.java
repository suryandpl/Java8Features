package com.test;

import java.util.ArrayList;
import java.util.BitSet;

public class PalindromePermutations {

	public static ArrayList<String> generatePermutation(String str) {
	      if (str.length() == 0) {
	         ArrayList<String> empty = new ArrayList<>();
	         empty.add("");
	         return empty;
	      }
	      char ch = str.charAt(0);
	      String subStr = str.substring(1);
	      ArrayList<String> lastCombination = generatePermutation(subStr);
	      ArrayList<String> newCombination = new ArrayList<>();
	      for (String val : lastCombination) {
	      for (int i = 0; i <= val.length(); i++) {
	            newCombination.add(val.substring(0, i) + ch + val.substring(i));
	         }
	       }
	      return newCombination;
	    }
	
	public static boolean permutation(String s) {
		if(s==null || s.length()<1) return false;
		
		BitSet bs = new BitSet(256);
		for(char c :s.toCharArray()) 
			bs.flip(c);
			return bs.cardinality()<=1;
		
	}
	
	public static boolean palPermutation(String s){
		int[] char_count = new int[128];
		for(int i=0;i<s.length();i++) {
			char_count[s.charAt(i)]++;
		}
		
		int count =0;
		for(int i=0;i<128;i++) {
			count+=char_count[i]%2;
		}
		
		return count<=1;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		  ArrayList<String> result = generatePermutation("google"); for(String s:result) {
		  System.out.println(s); }
		 
		
		System.out.println(palPermutation("surya"));
	}

}
