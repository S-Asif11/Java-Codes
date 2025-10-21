package com.oop.elc;

import java.util.Scanner;

import com.oop.blc.Loan;

public class CheckLoanDeatils {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter principle amount: ");
		double principal=Double.parseDouble(sc.nextLine());
		
		System.out.println("Enter Interest rate : ");
		double interestRate=Double.parseDouble(sc.nextLine());
		
		System.out.println("Enter Duration of month: ");
		int durationMonths=Integer.parseInt(sc.nextLine());
		
		Loan l = new Loan(principal,interestRate,durationMonths);
		
//		
		l.printLoanDData();

	}

}
