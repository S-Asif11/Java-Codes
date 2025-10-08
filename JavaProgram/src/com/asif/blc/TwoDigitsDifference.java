package com.asif.blc;

public class TwoDigitsDifference {
 
	public static int getDiffOfDigits(int x) {
		
		int n1= x / 10;
		int n2= x % 10;
		
		int dif = n1-n2;
		
		return dif;
	}
}
