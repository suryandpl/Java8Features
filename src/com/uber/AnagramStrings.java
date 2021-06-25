package com.uber;

public class AnagramStrings {
	
	static boolean findAnagram(String s1,String s2) {
		if(s1.length()!=s2.length()) return false;
		
		int[] count = new int[256];
		for(int i =0;i<s1.length();i++) {
			count[s1.charAt(i)]++;
			count[s2.charAt(i)]--;
		}
		
		for(int j=0;j<count.length;j++) {
			if(count[j] !=0) return false;
		}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean status  = findAnagram("surya","sryar");
		if(status) {
			System.out.println("Strings are anagrams");
		}else {
			System.out.println("Strings are not anagrams");
		}
	}

}
