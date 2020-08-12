package com.test;

public class AnagramStrings {

	static boolean findAnagram(String s1,String s2) {
		
		if(s1.length()!=s2.length()) return false;
		int[] count=new int[256];
		for(int i=0;i<s1.length();i++) {
			count[s1.charAt(i)]++;
			count[s2.charAt(i)]--;
		}
		
		for(int i=0;i<count.length-1;i++) {
			if(count[i]!=0) return false;
		}
		
		return true;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(findAnagram("surya","suray"));
	}

}
