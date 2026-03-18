package com.exam.elc;

import java.util.Scanner;

import com.exam.blc.Hotel;

public class HotelDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter days: ");
		int days = Integer.parseInt(sc.nextLine());
		System.out.println("Enter rate: ");
		double roomRate=Double.parseDouble(sc.nextLine());
		
		Hotel.calculateTotalAmount(roomRate,days);
		Hotel.calculateDiscountedAmount(days, roomRate);
		sc.close();
		

	}

}
