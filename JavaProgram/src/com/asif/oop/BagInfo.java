package com.asif.oop;

public class BagInfo {

	int chain;
	String name;
	int partition;
	
	public void getBagInformation() {
		
		System.out.println("In the company of "+name+" bag has "+chain+" chain "+" and has "+partition+" partition");
	}
	
	public void carry() {
		System.out.println("I have to carry my "+name+" bag for the clsss");
	}
}
