package com.asif.oop;

public class Employee 
{

	String firstName;
	String lastName;
	int employeeId;
	double salary;
	int noOfProject;
	
	public void setEmployeeData(String fname,String lname,int id,double sal,int nop) {
		firstName = fname;
		lastName = lname;
		employeeId=id;
		salary=sal;
		noOfProject=nop;
		
	}
	
	public void calculateSalary()
	{
		if(noOfProject>5 && noOfProject<=10) {
			salary+=5000;
		}
		if(noOfProject>10 && noOfProject<=20) {
			salary+=10000;
		}
		if(noOfProject>20) {
			salary+=15000;
		}
		
	}
	
	public void displayDetails() {
		System.out.println("First Name: "+firstName);
		System.out.println("Last name: "+lastName);
		System.out.println("Employee id: "+employeeId);
		System.out.println("Salary: "+salary);
		System.out.println("Numbe of project is: "+noOfProject);
	}
	
}
