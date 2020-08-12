package com.java.eight;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.IntPredicate;
import java.util.function.Predicate;
import java.util.stream.Stream;
class Employee{
	String name;
	double sal;
	Employee(){
		
	}
	Employee(String name,double sal){
		this.name=name;
		this.sal=sal;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSal() {
		return sal;
	}
	public void setSal(double sal) {
		this.sal = sal;
	}
}
//Predicate<T> --> return boolean
public class PredicateExample {

	public static void main(String[] args) {
		// TODO Auto-genterated method stub
		Predicate<Integer> p = i->i%2==0;
		int [] arr = {5,4,10,11,45};
		Arrays.stream(arr).forEach(x->System.out.println(p.test(x)));
		
		List<Employee> l = new ArrayList<Employee>();
		l.add(new Employee("surya",20000));
		l.add(new Employee("lakshmi",30000));
		l.add(new Employee("sony",35000));
		l.add(new Employee("venky",22000));
		Predicate<Employee> p1 = e->e.sal>20000 && e.getName().length()>4;
		Predicate<Employee> p2 = e->e.getName().length()>4;
		l.stream().filter(p1.and(p2)).forEach(e->System.out.println(e.getName()+" "+e.getSal()));
		
		//int primitive Predicate
		int[] x = {0,5,10,15,20,25,30,35};
		IntPredicate p3= i->i%2==0;
		IntPredicate p4= i->i>10;
		//and(),or(),negate()
		for(int y :x) {
			//and()
			if(p3.and(p4).test(y)) {System.out.println(y);}
			//or()
			if(p3.or(p4).test(y)) {System.out.println(y);}
			//negate() - opposite of predicate(odd numbers)
			System.out.println("**Negate**");
			if(p3.negate().test(y)) {System.out.println(y);}
		}
		
		
	}

}
