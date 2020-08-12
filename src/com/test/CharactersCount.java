package com.test;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class CharactersCount {
	//Solution 1
	static void getOccuringChar(String s) {
		int[] count = new int[256];
		for(int i=0;i<s.length();i++) {
			count[s.charAt(i)]++;
		}
		
		char[] ca = new char[s.length()];
		for(int i=0;i<s.length();i++) {
			ca[i] = s.charAt(i);
			
			int find = 0;
			for(int j=0;j<=i;j++) {
				if(s.charAt(i)==ca[j]) {
					find++;
				}
			}
			if(find == 1)
				System.out.println("Occurence of char : "+s.charAt(i)+" in the string is : "+count[s.charAt(i)]);
		}
		
	}
	
	 
	 static int hashFunc(char c) {
		return (c-'a');
	}
	//Solution 2: by using hashing technique
	static void countCharByUsingHash(String s) {

		int[] freq = new int[26];
		for(int i=0;i<s.length();i++) {
			//int index = hashFunc(s.charAt(i));
			int index = s.charAt(i)-'a';
			freq[index]++;
		}
		
		for(int i=0;i<26;i++) {
			if(freq[i]>0)
			System.out.println("String character : "+(char)(i+'a')+" : count is :"+freq[i]);
		}
	}
	
	
	//Solution 3 :by using collections
	static void getOccuringChar1(String s) {
		LinkedHashMap<Character,Integer> charMap = new LinkedHashMap<Character, Integer>();
		for(char c:s.toCharArray()) {
			 if(charMap.containsKey(c)) {
				 charMap.put(c, charMap.get(c)+1);
			 }else {
				 charMap.put(c, 1);
			 }
		}
		charMap.forEach((k,v)->System.out.println(k+":"+v));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//getOccuringChar("suryakumar");
		//getOccuringChar1("suryakumar");
		
		countCharByUsingHash("suryakumar");
	}

}
