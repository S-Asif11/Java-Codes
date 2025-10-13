package com.exam.elc;

import java.util.Scanner;

import com.exam.blc.Customer;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter id: ");
		int id=Integer.parseInt(sc.nextLine());
		System.out.println("Enter name: ");
		String name=sc.nextLine();
		System.out.println("Enter bill: ");
		double bill=Double.parseDouble(sc.nextLine());
		
		Customer.setCustomerDetails(id,name,bill);
		
		sc.close();
		
		

	}

}
