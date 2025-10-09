package com.asif.blc;

import java.util.Scanner;

public class Employee {
	
	int eid ;
	String name;
	double sal;
	
	public void setEmployeeData() {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter employee id: ");
		eid=Integer.parseInt(sc.nextLine());
		
		System.out.println("Enter employee name: ");
		name=sc.nextLine();
		
		System.out.println("Enter employee sal: ");
		sal=Double.parseDouble(sc.nextLine());
		
		sc.close();
	}
	
	public void getEmployeeData() 
	{
		System.out.println("Employee id is: "+eid);
		System.out.println("Employee id is: "+name);
		System.out.println("Employee id is: "+sal);
	}

	 
}
