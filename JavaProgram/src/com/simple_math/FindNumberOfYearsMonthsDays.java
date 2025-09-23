package com.simple_math;

public class FindNumberOfYearsMonthsDays {

	public static void main(String[] args) {
		int days=Integer.parseInt(args[0]);
		
		int year = days/365;
		int r = days%365;
		
		int months=r/30;
		int remainingDays=r%30;
		
		System.out.println("Number of Year is : "+year);
		System.out.println("Number of Months is: "+months);
		System.out.println("Number of Days: "+remainingDays);

	}

}
