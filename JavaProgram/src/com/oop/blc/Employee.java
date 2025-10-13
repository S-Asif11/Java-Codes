package com.oop.blc;

public class Employee {

	int employeeid;
	String employeename;
	double employeesalary;
	char employeegrade;
	
	public void setEmployeeData(int id,String name,double sal) 
	{
		
		employeeid=id;
		employeename=name;
		employeesalary=sal;
		
	}
	
	public void getEmployeeData() {
		System.out.println("Employee id is: "+employeeid);
		System.out.println("Employee name is: "+employeename);
		System.out.println("Employee salary is: "+employeesalary);
		System.out.println("Employee salary is: "+employeegrade);
		
	}
	
	public void employeeGrade() {
		
		if(employeesalary>=75000) {
			employeegrade='A';
		}
		if(employeesalary>=50000) {
			employeegrade='B';
		}
		if(employeesalary>=35000) {
			employeegrade='C';
		}
		if(employeesalary>=20000) {
			employeegrade='D';
		}
	}
}
