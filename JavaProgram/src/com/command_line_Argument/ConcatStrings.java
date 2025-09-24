package com.command_line_Argument;

public class ConcatStrings {

	public static void main(String[] args) {
		
		String inp = args[0] + " " +args[1] + " " +args[2] + " " +args[3]; 
		
//		StringBuilder sb =new StringBuilder();
//		
//		for(String s: args)
//		{
//			sb.append(s).append(" ");
//		}
		
		System.out.println("Concatenated String: "+inp);

	}

}
