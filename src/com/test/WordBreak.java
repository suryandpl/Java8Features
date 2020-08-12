package com.test;

public class WordBreak {
	public static void wordBreak(String dict, String str,String out)
	{
		
	  if (str.length() == 0) {  System.out.println(out); }
		 
	  for(int i=1;i<=str.length();i++) {
		  String prefix = str.substring(0, i);
		  if(dict.contains(prefix)) {
			  wordBreak(dict, str.substring(i),out+" "+prefix);
		  }
	  }
		
	}
		
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "I,A,AM,HE,HERE";
		String s2 = "IAM";
		wordBreak(s1, s2,"");
		
		
		
	}

}
