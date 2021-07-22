package com.uber;

import java.util.stream.Stream;

public class FilterMatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stream<String> stream = Stream.of("123","234","345");
		//boolean value = stream.filter(s -> s.length()>4).allMatch(s -> s.contains("0"));
		//stream.filter(s-> {System.out.println(""+s.length()>4);});
		stream.forEach(e-> System.out.println(""+String.valueOf(e.length()>4)));
		//System.out.println(value);
	}

}
