package com.asif.oop;

public class FanInfo 
{
	
	String name;
	String coil;
	int wings;
	
	public void switchOn() {
		
		System.out.println("The "+name+" with "+coil+" coil which has "+wings+"has stared rotating");
	}
	
	public void switchOff(){
		
		System.out.println("The "+name+" with "+coil+" coil which has"+wings+" has stoped rotataing");
	}

}
