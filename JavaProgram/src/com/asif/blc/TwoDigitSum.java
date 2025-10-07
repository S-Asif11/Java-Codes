package com.asif.blc;

public class TwoDigitSum {
	
	public static int  getSumOfDigits(int x) {
		
		int num1 = x/10;
		int num2 = x%10;
		
		int sum = (num1 + num2);
		
		return sum;
	}
}
