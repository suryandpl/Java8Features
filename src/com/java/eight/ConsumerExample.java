package com.java.eight;

import java.util.function.Consumer;

//Consumer<T> --> void
public class ConsumerExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Consumer<String> c = s->System.out.println(s);
		c.accept("surya");
		
		Student[] s = {new Student("surya",50),new Student("lakshmi",34),new Student("sony",85),new Student("chaitu",60),new Student("praba",36)};
		
		Consumer<Student> c1 = s1->System.out.println(s1.name+" "+s1.marks);
		for(Student s2:s) {
			c1.accept(s2);
		}
	}


}
