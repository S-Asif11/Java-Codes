package com.asif.elc;

import java.util.Scanner;
import com.asif.blc.Calculator;

public class ArithmeticCalculator {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
//		Scanner sc1 = new Scanner(System.in);
		
		System.out.println("Enter two Numbers:");
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		int retur =Calculator.add(x, y);
		
		System.out.println("Sum is: "+retur);
		
		int re2=Calculator.sub(x,y);
		System.out.println("Substraction is : "+re2);
		
		int re3=Calculator.mul(x,y);
		System.out.println("Multiplication is : "+re3);
		
		int re4=Calculator.div(x,y);
		System.out.println("Divition is : "+re4);
		
		sc.close();

	}

}
