package com.asif.elc;

import java.util.Scanner;

import com.asif.blc.NextMultipleOfHundred;

public class NxtMultipleOfHundred {

	public static void main(String[] args)
	{
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int x = sc.nextInt();
		
		int result = NextMultipleOfHundred.getNextMultipleOfHundred(x);
		
		System.out.println("Next Multiple of Hundred is: "+result);
		
		sc.close();
		
		
		
		
		

	}

}
