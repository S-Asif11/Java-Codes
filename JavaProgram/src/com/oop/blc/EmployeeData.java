package com.oop.blc;

public class EmployeeData {
	
	int eid;
	String ename;
	double esalary;
	
	public void setEmployeeData(int id, String name, double salary) {
		
		eid=id;
		ename=name;
		esalary=salary;
		
		
	}
	
	public void getEmployeeData() {
		
		System.out.println(""+ename+" who has id num "+eid+" recieved a salary of "+esalary);
		
		
	}

}
