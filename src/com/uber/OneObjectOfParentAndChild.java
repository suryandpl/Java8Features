package com.uber;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

//By using Set
/*class A{
	public static Set<Class<? extends A>> instances = new HashSet<>();
	public A() {
		synchronized (instances) {
		if(instances.contains(getClass())) {
			throw new RuntimeException("Duplication of "+getClass().getName());
		}
		System.out.println("Called...");
		instances.add(getClass());
		}
	}
	
}*/
//By using Map
class A{
	public static Map<Class<? extends A>,A> instances = new HashMap<>();
	
	public A() {
		if(instances.containsKey(getClass())) {
			throw new RuntimeException("Duplicate of "+getClass().getName());
		}
		System.out.println("Called...");
		instances.put(getClass(), this);
	}
}
class B extends A{
	
	
}

public class OneObjectOfParentAndChild {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new A();
		new B();
		new B();
		new B();

	}

}
