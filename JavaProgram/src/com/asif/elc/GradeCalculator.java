package com.asif.elc;

import java.util.Scanner;
import com.asif.blc.Student;


public class GradeCalculator {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the marks: ");
		double marks = sc.nextDouble();
		
		String result =Student.calculateGrade(marks);
		
		System.out.println("Grade is :"+result);
		
		sc.close();
		
		
	}

}
