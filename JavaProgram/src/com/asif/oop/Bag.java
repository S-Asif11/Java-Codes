package com.asif.oop;

public class Bag {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BagInfo bag=new BagInfo();
		
		bag.chain = 4;
		bag.name="Asus";
		bag.partition=4;
		
		bag.getBagInformation();
		bag.carry();

	}

}
