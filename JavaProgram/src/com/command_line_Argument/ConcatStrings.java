package com.command_line_Argument;

public class ConcatStrings {

	public static void main(String[] args) {
		
		StringBuilder sb =new StringBuilder();
		
		for(String s: args)
		{
			sb.append(s).append(" ");
		}
		
		System.out.println("Concatenated String: "+sb);

	}

}
