package com.exam.blc;

public class Hotel {

	public static double calculateTotalAmount(double roomRate,int days) {
		
		double totalAmount=roomRate*days;
		
		System.out.println("Room Rate (per day): "+roomRate);
		System.out.println("Total Amount :  "+totalAmount);
		
		return totalAmount;
		
	}
	
	public static double calculateDiscountedAmount(int days, double totalAmount) {
		
		if(days<=2) {
			return totalAmount;
			
		}
		else if (days>=3 && days <=4) {
			totalAmount=totalAmount-(totalAmount*0.05);
		}
		else if (days>=5 && days <=9) {
			totalAmount=totalAmount-(totalAmount*0.10);
		}
		else if (days>=10) {
			totalAmount=totalAmount-(totalAmount*0.20);
		}
		
		System.out.println("Days Stayed :  "+days);
		System.out.println("Discount :  "+totalAmount);
		System.out.println("Amount after Discount: ₹10800.0");
		
		
		
		return totalAmount;
	}
}
