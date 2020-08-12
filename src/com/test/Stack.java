package com.test;

public class Stack {

	int arr[];
	int capacity;
	int top;
	Stack(int size){
		arr = new int[size];
		capacity = size;
		top=-1;
	}
	//inserting the elements into stack
	public void push(int ele) {
		if(isFull()) {
			System.out.println("--stack is full so increasing capacity--");
			int[] new_arr = new int[capacity*2];
			
			for(int i=0;i<capacity;i++) {
				new_arr[i] = arr[i];
			}
			capacity=capacity*2;
			 arr = new_arr;
		}
		arr[++top] = ele;
		System.out.println("element added: "+ele);
		
	}
	
	//retrieve and remove the elements
	public int pop() {
		if(isEmpty()) {
			System.out.println("--stack is empty--");
		}
		System.out.println("remove element : "+arr[top]);
		return arr[top--];
	}
	
	//retrieve element without remove
	public int peak() {
		System.out.println("Just peak the element : "+arr[top]);
		return arr[top];
	}
	//check the stack is empty
	public boolean isEmpty() {
		return (top==-1);
	}
	//check the stack is full
	public boolean isFull() {
		return (top == capacity-1);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack stack = new Stack(3);
		stack.push(1);stack.push(2);stack.push(3);stack.push(4);stack.push(5);stack.push(6);
		stack.pop();stack.peak();
		
		
	}

}
