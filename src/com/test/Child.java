package com.test;


class Parent{
	void msg() throws Exception{
		System.out.println("Parent");
	}
}
public class Child extends Parent{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parent p = new Child();
		try {
			p.msg();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	void msg() throws ArithmeticException{
		System.out.println("child");
	}

}
