package com.asif.blc;



public class Hotel {
	public static double calculateTotalAmount(double roomRate, int  days) {
		
		double totalAmount=roomRate*days;
		
		return totalAmount;
	}
	
	public static double calculateDiscountedAmount(int days, double totalAmount) {
		
		if(days>1 && days<=2) {
			double dis = totalAmount;
			return dis;
		}
		else if(days>3 && days <=4) {
			double dis = totalAmount-(totalAmount*.05);
			return dis;
		}
		
		else if(days>5 && days <=9) {
			double dis = totalAmount-(totalAmount*.10);
			return dis;
		}
		
		else if(days>=10) {
			double dis = totalAmount-(totalAmount*.20);
			return dis;
		}
		else return totalAmount;
		
	}

}
