package com.asif.elc;

import com.asif.blc.TwoDigitsDifference;
import java.util.Scanner;


public class TwoDigitDiffResult {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the number: ");
		
		int x=sc.nextInt();
		
		int result =TwoDigitsDifference.getDiffOfDigits(x);
		
		System.out.println(result);
		sc.close();
		
		
		
		
	}

}
