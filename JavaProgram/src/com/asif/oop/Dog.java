package com.asif.oop;

import java.util.Scanner;

public class Dog {

	public static void main(String[] args) {
		
		DogInfo pet = new DogInfo();
		
//		pet.age=2;
//		pet.height=2.4;
//		pet.name="Bull Dog";
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Dogs name: ");
		String name = sc.nextLine();
		
		System.out.println("Enter Dogs age: ");
		int age = sc.nextInt();
		
		System.out.println("Enter Dogs height: ");
		double height = sc.nextDouble();
		
		pet.age=age;
		pet.height=height;
		pet.name=name;
		
		pet.getDogInformation();
		pet.bark();
		

	}

}
