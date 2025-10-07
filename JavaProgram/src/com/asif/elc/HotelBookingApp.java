package com.asif.elc;

import java.util.Scanner;
import com.asif.blc.Hotel;


public class HotelBookingApp {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Customer Name: ");
		String name=sc.nextLine();
		
		System.out.println("Enter Hotel Name: ");
		String Hname=sc.nextLine();
		
		System.out.println("Enter RoomRate per day: ");
		double roomRate=sc.nextDouble();
		
		System.out.println("Enter Number of Days Stayed: ");
		double days=sc.nextDouble();
		
		
		double TA = Hotel.calculateTotalAmount(roomRate, (int) days);
		
		double DA=Hotel.calculateDiscountedAmount((int) days, TA);
		
		
		System.out.println("Hotel Name is: "+name);
		System.out.println("Hotel Name is: "+Hname);
		System.out.println("Total Amount: "+TA);
		System.out.println("Discounted Amount: "+DA);
		
				
		sc.close();
		
		
	}

}
