package com.asif.blc;

public class Discount {
	public static double calculateDiscount(double billAmount) {
		
		if(billAmount>=5000) {
			billAmount = billAmount-(billAmount*0.2);
		}
		
		else if(billAmount>=3000) {
			billAmount = billAmount-(billAmount*0.15);
		}
		else if(billAmount>=1000) {
			billAmount = billAmount-(billAmount*0.10);
		}
		else billAmount = billAmount-(billAmount*0.05);
		
		return billAmount;
		
	}
}
