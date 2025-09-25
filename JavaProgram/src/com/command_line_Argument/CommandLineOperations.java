package com.command_line_Argument;

public class CommandLineOperations {

	public static void main(String[] args) {
			
			int n=args.length;
			if(n==0) {
				System.out.println("No Arguments Provided");
			}
			
			if(n==1) {
				int num = Integer.parseInt(args[0]);
				
				System.out.println("Square of numner is: "+(num*num));
			}
			else if(n==2) {
				int num1 = Integer.parseInt(args[0]);
				int num2 = Integer.parseInt(args[1]);
				
				System.out.println("Sum of numner is: "+(num1+num2));
			}
			
			else if(n>2) {
				 int sum = 0;
		            for (String arg : args) {
		                sum += Integer.parseInt(arg);
		            }
		            System.out.println("Sum of all arguments: " + sum);
			}
			else System.out.println("Invalid Input");
			
			
			

	}

}
