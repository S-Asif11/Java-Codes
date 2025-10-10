package com.oop.elc;

import java.util.Scanner;

import com.oop.blc.EmployeeData;

public class Employee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EmployeeData ed=new EmployeeData();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("ENter Employee id: ");
		int id=Integer.parseInt(sc.nextLine());
		System.out.println("ENter Employee name: ");
		String name = sc.nextLine();
		System.out.println("ENter Employee salary: ");
		double salary = Double.parseDouble(sc.nextLine());
		
		ed.setEmployeeData(id, name, salary);
		ed.getEmployeeData();
		
		sc.close();

	}

}
