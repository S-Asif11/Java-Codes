package com.simple_math;

public class WholeSeller {

	public static void main(String[] args) {
		double amt = Double.parseDouble(args[0]);
		double dis;
		double disAmount;
		double AmountPayable;
		
		if(amt<5000) {
			dis = 0.05;
			disAmount=amt*dis;
			AmountPayable=amt-disAmount;
			
			System.out.println("Discount is :"+(dis*100));
			System.out.println("Discount is :"+disAmount);
			System.out.println("Discount is :"+AmountPayable);
		}
		if(amt>=5000 && amt<10000) {
			dis = 0.10;
			disAmount=amt*dis;
			AmountPayable=amt-disAmount;
			
			System.out.println("Discount is :"+(dis*100));
			System.out.println("Discount is :"+disAmount);
			System.out.println("Discount is :"+AmountPayable);
		}
		if(amt>=10000) {
			dis = 0.15;
			disAmount=amt*dis;
			AmountPayable=amt-disAmount;
			
			System.out.println("Discount is :"+(dis*100));
			System.out.println("Discount is :"+disAmount);
			System.out.println("Discount is :"+AmountPayable);
		}

	}

}
