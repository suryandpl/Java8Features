package com.java.eight;

import java.util.stream.Stream;

public class StreamIterate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//iteration and method reference(::)
		Stream.iterate(10, ele->ele+1).filter(ele->ele%5==0).limit(4).forEach(System.out::println);
			
		
	}

}
