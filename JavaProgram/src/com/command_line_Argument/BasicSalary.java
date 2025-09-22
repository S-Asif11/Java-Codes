package com.command_line_Argument;

public class BasicSalary {

	public static void main(String[] args) {
		
		double bs=Double.parseDouble(args[0]);
		
		double hra=0.15*bs;
		
		double ca=0.15*bs;
		
		double entertainment=0.10*bs;
		
		double totalSalary = bs+hra+ca+entertainment;
		
		System.out.println("Total Salary is "+totalSalary);

	}

}
