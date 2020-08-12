package com.java.eight;

import java.util.Date;
import java.util.function.Supplier;


public class SupplierExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Supplier<Date> s = ()->new Date();
		
		System.out.println(s.get());
		Employee e =factory(Employee::new);
		System.out.println(e.getName()+":"+e.getSal());
	}
	
	public static Employee factory(Supplier<? extends Employee> s) {
		Employee e = s.get();
		e.setName("surya");e.setSal(1000);
		return e;
		
	}

}
