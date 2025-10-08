package com.asif.blc;

public class Circle 
{
	
	public static String getArea(double r) {
		
		if(r<=0) {
			return "0";
		}
		else {
			 double area = Math.PI*r*r;
			return String.format("%.2f",area);
		}
		
	}

}
