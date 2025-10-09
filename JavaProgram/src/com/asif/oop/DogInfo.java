package com.asif.oop;

public class DogInfo {
	
	String name;
	double height;
	int age;
	
	public void getDogInformation() {
		
		System.out.println("Dog name is :"+name);
		System.out.println("Dog height is :"+height);
		System.out.println("Dog age is :"+age);
	}
	
	public void bark() {
		
		System.out.println(name+" Barks when he sees a man hitting him");
	}
}
