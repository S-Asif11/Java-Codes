package com.asif.elc;

import java.util.Scanner;

import com.asif.blc.RoundedSum;

public class SumRounded {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the Value of X: ");
		int x =sc.nextInt();
		
		System.out.print("Enter the Value of Y: ");
		int y =sc.nextInt();
		
		System.out.print("Enter the Value of Z: ");
		int z =sc.nextInt();
		
		int result = RoundedSum.sumOfRoundedValues(x, y, z);
		
		System.out.println("Result is :"+result);
		
		sc.close();
	}

}
