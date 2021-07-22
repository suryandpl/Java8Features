package com.uber;

import java.util.Arrays;
import java.util.List;

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> versions = Arrays.asList("java 6","java 7","java 8");
		boolean flag = versions.stream().allMatch(str -> {
			System.out.println("Testing :"+str);
			return str.contains("8");
			
		});
		System.out.println(flag);

	}

}
