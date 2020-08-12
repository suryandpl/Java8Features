package com.test;

public class StringAvailable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "abcde";
		System.out.println(input.contains("ed"));
		boolean result = input.indexOf("cd")!=-1?true:false;
		System.out.println(result);
	}

}
