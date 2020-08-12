package com.java.eight;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.DoubleBinaryOperator;
import java.util.function.DoubleToLongFunction;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.function.IntUnaryOperator;
import java.util.function.LongToDoubleFunction;
import java.util.function.ToIntFunction;
import java.util.function.UnaryOperator;
class Student{
	String name;
	int marks;
	Student(String name,int marks){
		this.name=name;
		this.marks = marks;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
}
///Function<T,R> --> R return type
public class FunctionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Function<Integer,Integer> f = i->i*i;
		int[] x = {1,2,3,4,5};
		for(int y:x) {
			System.out.println(f.apply(y));
		}
		
		Function<String,Integer> f1 = s->s.length();
		System.out.println(f1.apply("surya"));
		
		Function<String,String> f2 = s->s.toUpperCase();
		System.out.println(f2.apply("surya"));
		
		Function<Student,String> cf = s->{int marks = s.marks;
		String grade="";
		if(marks>=80) grade="A";
		else if(marks>=60) grade="B";
		else if(marks>=50) grade="C";
		else if(marks>=35) grade="D";
		else  grade="E";
		return grade;};
		
		Student[] s = {new Student("surya",50),new Student("lakshmi",34),new Student("sony",85),new Student("chaitu",60),new Student("praba",36)};
		
		for(Student s1:s) {
			System.out.println(s1.name+" "+s1.marks+" "+cf.apply(s1));
		}
		
		//function chaining
		//f1.andThen(f2).apply(i) - In this case first f1 and then f2
		//f1.compose(f2).apply(i) - In this case first f2 and then f1
		Function<Integer,Integer> f3 = i->2*i;
		System.out.println(f.andThen(f3).apply(2));
		System.out.println(f.compose(f3).apply(2));
		//BiFunction
		BiFunction<Integer, Integer, Integer> bf = (i,j)->i*j;
		System.out.println(bf.apply(10,20));
		//Predefined IntFunction
		IntFunction<Integer>  intf=i->i*2;  
		System.out.println(intf.apply(5));
		
		ToIntFunction<Integer> toInt = i->i*2;
		System.out.println(toInt.applyAsInt(5));
		
		LongToDoubleFunction ldf = i->i*6;
		System.out.println(ldf.applyAsDouble(5l));
		
		DoubleToLongFunction dlf = i->(long)(i+i);
		System.out.println(dlf.applyAsLong(6.2));
		
		UnaryOperator<Integer> uo = i->i*2;
		System.out.println(uo.apply(5));

		IntUnaryOperator uio = i->i*2;
		System.out.println(uio.applyAsInt(5));
		
		BinaryOperator<Integer> bo = (i,j)->i+j;
		System.out.println(bo.apply(5,6));
		
		DoubleBinaryOperator dbo = (i,j)->i*j;
		System.out.println(dbo.applyAsDouble(5.5,6.5));
	}
}
