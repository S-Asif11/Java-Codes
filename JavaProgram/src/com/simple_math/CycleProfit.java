package com.simple_math;

public class CycleProfit {

	public static void main(String[] args) {
		double oldCyclePrice=1200;
		double repair=250;
		double coloring = 350;
		double acc= 500;
		
		double totalSpend=oldCyclePrice+repair+coloring+acc;
		
//		System.out.println("Total spend after buying the cycle: "+totalSpend);
		
		//Rohan wants to make a profit of Rs. 1500 on selling the cycle
		
		double sellingPrice=totalSpend+1500;
		
		System.out.println("Seling price of the cycle is :"+sellingPrice);

	}

}
