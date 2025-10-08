package com.asif.elc;

import java.util.Scanner;

import com.asif.blc.Student2;

public class Test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter name: ");
		String name=sc.nextLine();
		
		System.out.println("Enter roll number: ");
		 int roll = sc.nextInt();
		
		System.out.println("Enter fees: ");
		double fees=sc.nextDouble();
		
		String result = Student2.getStudentDetails(roll, name, fees);
		
		System.out.println(result);
		
		sc.close();

	}

}
