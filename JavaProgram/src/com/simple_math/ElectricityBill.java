package com.simple_math;

public class ElectricityBill {

	public static void main(String[] args) {
		double unit = Double.parseDouble(args[0]);
		
		double amt = 160;
		double rUnit;
		double rsPerUnit;
		double bill;
		
		if(unit<=100) {
			System.out.println(amt);
			
		}
		if(unit>100 && unit<=250) {
			rUnit=unit-100;
			rsPerUnit=rUnit*1;
			bill=160+(rsPerUnit);
			System.out.println(rUnit);
			System.out.println(rsPerUnit);
			System.out.println("Electricity Bill is: "+bill);
			
		}
		if(unit>250) {
			rUnit=unit-100;
			rsPerUnit=rUnit*1.2;
			bill=160+(rsPerUnit);
			System.out.println(rUnit);
			System.out.println(rsPerUnit);
			System.out.println("Electricity bill is: "+bill);
			
		}

	}

}
