package com.oop.elc;

import java.util.Scanner;
import com.oop.blc.Employee;

public class EmployeeData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee asif=new Employee();
		
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter id: ");
		int id=Integer.parseInt(sc.nextLine());
		System.out.println("Enter name: ");
		String name=sc.nextLine();
		System.out.println("Enter salary: ");
		double sal=Double.parseDouble(sc.nextLine());
		
		asif.setEmployeeData(id, name, sal);
		asif.employeeGrade();
		asif.getEmployeeData();
		sc.close();
		

	}

}
