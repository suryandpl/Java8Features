package com.test;

public class Queue {
	int[] arr;
	int capacity;
	int front;
	int last;
	int count;
	Queue(int size){
		arr = new int[size];
		capacity = size;
		front =0;
		last=-1;
		count = 0;
	}
	
	//inserting an elements into Queue
	public void enqueue(int ele){
		if(isFull()) {
			System.out.println("Queue is full");
			System.exit(0);
		}
		last=(last+1)%capacity;		
		System.out.println("Inserting an element : "+ele+" at index : "+last);
		arr[last] = ele;
		count++;
	}
	//Removing an element from Queue
	public void dequeue() {
		if(isEmpty()) {
			System.out.println("Queue is empty");
		}
		System.out.println("Removing an element : "+arr[front]+" at index : "+front);
		front = (front+1)%capacity;
		count--;
		
	}
	//Returning the element without remove
	public int peak() {
		if(isEmpty()) {
			System.out.println("Queue is empty");
		}
		System.out.println("Peak the element : "+arr[front]);
		return arr[front];
	}
	//Size of the Queue
	public int size() {
		return count;
	}
	public boolean isFull() {
		return  (capacity == size());
	}
	public boolean isEmpty(){
		return (size()==0);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue qu = new Queue(2);
		qu.enqueue(1);
		qu.enqueue(2);		
 		System.out.println("Size : "+qu.size());
		qu.peak();qu.peak();
		qu.dequeue();qu.dequeue();
		System.out.println("Size : "+qu.size());
	}

}
