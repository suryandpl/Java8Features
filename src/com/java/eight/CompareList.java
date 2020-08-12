package com.java.eight;

import java.util.ArrayList;
import java.util.List;

public class CompareList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> l1= new ArrayList<String>();
		l1.add("a");l1.add("b");l1.add("c");l1.add("d");

		List<String> l2= new ArrayList<String>();
		l2.add("a");l2.add("b");
		
		l1.stream().filter(x->!l2.contains(x)).forEach(System.out::println);
	}

}
