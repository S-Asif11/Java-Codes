package com.asif.elc;

import java.util.Scanner;
import com.asif.blc.Discount;

public class ShoppingCart {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Customer name: ");
		String name =sc.nextLine();
		
		System.out.println("Enter amount : ");
		double billAmount =sc.nextDouble();
		
		double num =Discount.calculateDiscount(billAmount);
		
		System.out.println("Customer name is: "+name);
		System.out.println("Original bill is: "+billAmount);
		System.out.println("Total Bill is : "+num);
		
		sc.close();

	}

}
