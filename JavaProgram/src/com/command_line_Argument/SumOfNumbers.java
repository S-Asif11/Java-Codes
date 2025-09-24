package com.command_line_Argument;

public class SumOfNumbers {

	public static void main(String[] args) {
		int n1 = Integer.parseInt(args[0]); //10
		int n2 = Integer.parseInt(args[1]); //20
		int n3 = Integer.parseInt(args[2]); //30
		int n4 = Integer.parseInt(args[3]); //40
		
		int sum = n1+n2+n3+n4;
		
		System.out.println(sum); //100
		

	}

}
