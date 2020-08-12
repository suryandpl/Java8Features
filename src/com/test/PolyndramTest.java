package com.test;

public class PolyndramTest {

	public static boolean test(String s) {
		//Solution 1
		  StringBuffer sb = new StringBuffer(s);
		  System.out.println(sb.reverse());
		  if(s.equals(sb.toString())) { System.out.println("true"); }
		//Solution 2 
		int i=0, l=s.length()-1;		
		while(i<l) {
			if(s.charAt(i)!=s.charAt(l)) {
				return false;
			}
			i++; l--;
		}
		return true;
	}
	//Solution 3
	public static boolean stringReverse(String s) {
		String s1="";
		for(int i =s.length()-1;i>=0;i--) {
			s1+=s.charAt(i);
		}
		//System.out.println(s1);
		return s.equals(s1);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean b = test("surya");
		System.out.println(b);
		
		boolean b1 = stringReverse("ssssss");
		System.out.println(b1);
	}

}
