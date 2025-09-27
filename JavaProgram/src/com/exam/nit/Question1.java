package com.exam.nit;

public class Question1 {

	public static void main(String[] args) {
		double n1 =Double.parseDouble(args[0]);
		double n2 =Double.parseDouble(args[1]);
		double n3 =Double.parseDouble(args[2]);
		
		double sum = n1+n2+n3;
		
		System.out.println("Sum is :"+sum);
		
		double avg = sum/3;
		
		System.out.println("Avarage is: "+avg);
		
		

	}

}
