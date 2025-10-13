package com.exam.elc;

import java.util.Scanner;

import com.exam.blc.Discount;

public class DiscountTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter amt: ");
		double billAmount=Double.parseDouble(sc.nextLine());
		Discount.calculateDiscount(billAmount);
		
		sc.close();
	}

}
