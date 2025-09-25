package com.command_line_Argument;

public class SumOfAnyNumbers {

	public static void main(String[] args) {
		
		int sum=0;
		for(String n:args) {
			int num=Integer.parseInt(n);
			
			sum+=num;
												
		}
		System.out.println(sum);

	}

}
