package com.asif.oop;

public class CarInfo {

	
	String name;
	String color;
	int model;
	
	public void getCarInformation() {
		
		System.out.println(name+" of model "+model+" has "+color+" color in it");
	}
	
	public void drive() {
		System.out.println("I am going to take my "+name+" out for a date");
	}
}
