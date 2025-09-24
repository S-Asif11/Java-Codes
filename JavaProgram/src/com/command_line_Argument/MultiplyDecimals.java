package com.command_line_Argument;

public class MultiplyDecimals {

	public static void main(String[] args) {
		double n1 =Double.parseDouble(args[0]); //12.5
		double n2 =Double.parseDouble(args[1]); //3.2
		
		double mul = n1*n2;
		
		System.out.println(mul); //40.0

	}

}
