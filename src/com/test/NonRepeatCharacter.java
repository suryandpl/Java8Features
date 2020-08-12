package com.test;

public class NonRepeatCharacter {

	static int nonRepeatFirstChar(String s) {
		int[] count = new int[256];
		for(int i=0;i<s.length();i++) {
			count[s.charAt(i)]++;
		}
		int res = -1;
		for(int i=0;i<s.length();i++) {
			if(count[s.charAt(i)]==1) {
				res=i;
				break;
			}
		 	
		}
		return res;
	}
	
	static int func(char c) {
		return (c-'a');
	}
	static int byUsingHash(String s) {
		int res = -1;
		int freq[] = new int[26];
		for(int i=0;i<s.length();i++) {
			int index = func(s.charAt(i));
			freq[index]++;
		}
		
		for(int i=0;i<26;i++) {
			if(freq[i]==1) return freq[i]; 
		} 
		return res;
	}
	
	static char firstNonRepeat(String s) {
		int[] arr = new int[26];
		for(int i=0;i<s.length();i++) {
			arr[s.charAt(i)-'a']++;
		}
		for(int i=0;i<s.length();i++) {
			if(arr[s.charAt(i)-'a']==1) return s.charAt(i);
		}
		
		return '-';
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "suryakumar";
		//int index = nonRepeatFirstChar(s);
		
		int index = byUsingHash(s);System.out.println(index);
		System.out.println(index==-1?"String might empty or all characters are repeat":s.charAt(index));
		
		System.out.println(firstNonRepeat(s));
	}

}
