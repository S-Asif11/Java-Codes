package com.simple_math;

public class SellingPrice {

	public static void main(String[] args) {
		double bp=32500;
		double profit = 0.27*bp;
		
		System.out.println("Profit is: "+profit);
		
		double sp = bp+profit;
		
//		System.out.println(sp);
		
		double gst=sp *.05;
		
		System.out.println("GST price is: "+gst);
		
		double totalSellingPrice=sp+gst;
		System.out.println("Total selling price is :"+totalSellingPrice);

	}

}
