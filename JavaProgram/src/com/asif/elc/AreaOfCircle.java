package com.asif.elc;

import java.util.Scanner;
import com.asif.blc.Circle;

public class AreaOfCircle {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Radius: ");
		double r =sc.nextDouble();
		
		 String result = Circle.getArea(r);
		
		System.out.println("Area is :" +result);
		
		sc.close();

	}

}
