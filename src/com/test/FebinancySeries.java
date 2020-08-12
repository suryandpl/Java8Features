package com.test;

public class FebinancySeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=0,j=1,k,count=10;
		System.out.print(i+" "+j);
		for(int a=2;a<count;a++) {
			k=i+j;
			i=j;
			j=k;
			System.out.print(" "+k);
		}
	}

}
