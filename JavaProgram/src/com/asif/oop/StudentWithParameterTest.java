package com.asif.oop;

import java.util.Scanner;

public class StudentWithParameterTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StudentWithParameter asif = new StudentWithParameter();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter id: ");
		int id =Integer.parseInt(sc.nextLine());
		System.out.println("Enter name: ");
		String name =sc.nextLine();
		System.out.println("Enter marks: ");
		int marks =Integer.parseInt(sc.nextLine());
		
		
		asif.setStudentData(id, name,marks);
		asif.studentGrade();
		System.out.println(asif.getStudentData());

	}

}
