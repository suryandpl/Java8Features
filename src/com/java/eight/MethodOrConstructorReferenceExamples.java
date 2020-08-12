package com.java.eight;

class Sample{
	Sample(){
		System.out.println("no-arg constructor");
	}
	Sample(String s){
		System.out.println("String arg constructor : "+s);
	}
}
interface Interf{
	//public void add(int a,int b);
	//public Sample get();
	//public Sample get(String s);
	public Employee get(String name,double sal);
}

public class MethodOrConstructorReferenceExamples {
	public static void m1() {
		for (int i=0;i<10;i++) {
			System.out.println("Child");
		}
	}
	public void m2() {
		for (int i=0;i<10;i++) {
			System.out.println("Child-1");
		}
	}
	public static void sum(int x,int y) {
		System.out.println("The sum is : "+(x+y));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Runnable r = ()->{
			//for (int i=0;i<10;i++) {
				//System.out.println("Child");
			//}
		//};
		//static method reference(classname::methodname)
		//Runnable r = MethodOrConstructorReferenceExamples::m1;
		//non static method
		/*
		 * MethodOrConstructorReferenceExamples obj = new
		 * MethodOrConstructorReferenceExamples(); Runnable r1 = obj::m2; Thread t = new
		 * Thread(r1);t.start(); for (int i=0;i<10;i++) { System.out.println("Main"); }
		 */
		
		/*
		 * Interf i = (a,b)->System.out.println("The sum is :"+(a+b)); i.add(10, 20);
		 * 
		 * Interf i1 = MethodOrConstructorReferenceExamples::sum; i1.add(100, 200);
		 */
		
		//constructor reference
		//Interf cr = Sample::new;
		//Sample s = cr.get();
		//Sample s1 = cr.get("surya");
		
		//Getting employee object by using lambda
		Interf i = (name,sal)->new Employee(name,sal);
		System.out.println(i.get("surya", 100.0));
		
		//getting an employee object by using constructor reference
		Interf i1=Employee::new;
		System.out.println(i1.get("surya", 200.0));
	}

}
