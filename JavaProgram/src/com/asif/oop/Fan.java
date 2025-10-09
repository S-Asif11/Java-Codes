package com.asif.oop;

import java.util.Scanner;

public class Fan {

	public static void main(String[] args) {
		
		FanInfo fan=new FanInfo();
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("ENter fan name: ");
		String name =sc.nextLine();
		
		System.out.println("Enter coil name: ");
		String coil=sc.nextLine();
		
		System.out.println("Enter wings of the fan: ");
		int wings=sc.nextInt();
		
		fan.coil=coil;
		fan.name=name;
		fan.wings=wings;

		
		fan.switchOn();
		fan.switchOff();
	}

}
