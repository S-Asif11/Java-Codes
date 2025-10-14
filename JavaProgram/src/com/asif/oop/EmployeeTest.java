package com.asif.oop;

import java.util.Scanner;

public class EmployeeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee asif = new Employee();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter first name: ");
		String fname = sc.nextLine();
		System.out.print("Enter first name: ");
		String lname = sc.nextLine();
		System.out.print("Enter ID: ");
		int id = Integer.parseInt(sc.nextLine());
		System.out.print("Enter Salary: ");
		double sal = Double.parseDouble(sc.nextLine());
		System.out.print("Enter no of projects ");
		int nop = Integer.parseInt(sc.nextLine());
		
		
		asif.setEmployeeData(fname, lname, id, sal, nop);
		asif.calculateSalary();
		asif.displayDetails();
		
		

	}

}
