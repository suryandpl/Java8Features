package com.test;

import java.util.BitSet;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.TreeSet;
import java.util.Vector;

public class Test {
	
	static void findArray(int A[],int n) {
		Map<Integer,Integer> map = new HashMap<Integer,Integer>();
		map.put(A[0], 1);
		
		int a_size=1; int a_index=0;
		for(int i=1;i<n;i++) {
			map.put(A[i], map.get(A[i]-1)==null?1:map.get(A[i]-1)+1);
		}
		System.out.println(map);
	} 
	public static void main(String[] args) {
		PriorityQueue<Character> q = new PriorityQueue<Character>();
		System.out.println(q.peek());
		System.out.println(q.poll());
		
		/*
		 * BitSet b1 = new BitSet(); BitSet b2 = new BitSet();
		 * b1.set(7);b1.set(1);b1.set(2);b1.set(4);b1.set(3);b1.set(6);
		 * b2.set(4);b2.set(6);b2.set(3);b2.set(9);b2.set(2); b1.andNot(b2); b1.and(b2);
		 * System.out.println(b1); System.out.println(b2);
		 * System.out.println(b1.equals(b2));
		 */
		/*
		 * Vector v = new Vector(3); v.add(1);v.add(2);v.add(3);
		 * 
		 * Collections.fill(v, 1); System.out.println(v);
		 */
		
		/*
		 * int A[] = {2,5,3,7,4,8,5,13,6}; findArray(A, A.length);
		 */
		// TODO Auto-generated method stlub
		/*
		 * LinkedList<String> object = new LinkedList<String>();
		 * object.add("A");object.add("B");object.fiadd("C");object.add("D");object.add(
		 * "E");object.add("F");
		 */
		/*
		 * object.remove("B"); object.remove(3); object.removeFirst();
		 * object.removeLast();
		 */
		/*
		 * System.out.println(object); object.set(1, "Y"); System.out.println(object);
		 */
		/*
		 * TreeSet<String> ts = new TreeSet<String>();
		 * ts.add("acd");ts.add("aaa");ts.add("bas");ts.add("cac");ts.add("acd");
		 * System.out.println(ts);
		 * System.out.println(ts.floor("abc")+ts.ceiling("aca")+ts.higher("aab"));
		 */
		
	}

}
