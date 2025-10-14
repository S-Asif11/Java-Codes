package com.asif.switch_case;

import java.util.Scanner;

public class SwitchDemo1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter color: ");
		char color = sc.nextLine().toLowerCase().charAt(0);
		
		switch(color) {
		
		case 'b':System.out.println("color is black");
		
		break;
		
		case 'w':System.out.println("color is WHITE");
		break;
		
		case 'r':System.out.println("color is red");
		break;
		
		case 'y': System.out.println("colo is yellow");
		break;
		
		}
		
		sc.close();
		
		

	}

}
