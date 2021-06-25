package com.uber;

public class FindAngleBetweenClockHands {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		findAngle(3,45);
	}
	
	static void findAngle(int hour, int minute) {
		int h = (hour*360)/12;
		int m = (minute*360)/60;
		
		int angle = Math.abs(h-m);
		System.out.println(angle);
	}

}
