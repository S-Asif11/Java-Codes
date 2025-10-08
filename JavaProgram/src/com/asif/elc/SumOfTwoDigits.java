package com.asif.elc;

import com.asif.blc.TwoDigitSum;

import java.util.Scanner;

public class SumOfTwoDigits {

	public static void main(String[] args) {
		
			Scanner sc = new Scanner(System.in);
			System.out.print("Enter the number: ");
			int x = sc.nextInt();
			
			 int result = TwoDigitSum.getSumOfDigits(x);  // Call static method
		     System.out.print("Sum of digits: " + result);

		      sc.close();
			
			
	}

}
