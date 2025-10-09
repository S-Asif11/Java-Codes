package com.asif.oop;

public class Car {

	public static void main(String[] args) {
		CarInfo car=new CarInfo();
		
		car.color="Red";
		car.model=8;
		car.name="BMW";
		
		
		car.getCarInformation();
		car.drive();

	}

}
