package com.uber;

public class PrimeNumber {
	
	static boolean isPrime(int n) {
		if(n<=1) {
			return false;
		}
		for(int i=2;i<n;i++) {
			if(n%i==0) return false;
		}
		return true;
	}

	static void printPrimes(int n) {
		if(n<=1) {
			System.out.println("It is not a primary number");
		}
		for(int i=2;i<n;i++) {
			if(n/i==0)System.out.print(i);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*if(isPrime(9)) {
			System.out.println("It is a prime number");
		}*/
		
		printPrimes(20);

	}

}
