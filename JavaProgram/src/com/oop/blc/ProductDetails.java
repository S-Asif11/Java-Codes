package com.oop.blc;

public class ProductDetails {
	
	int pid;
	String pname;
	double prprice;
	
	public void setProductData(int id, String name, double price) {
		
		pid=id;
		pname=name;
		prprice=price;
	}
	
	public void getProductInfo() {
		
		System.out.println(""+pname+" which has id num "+pid+" has a price of "+prprice);
	}
	
	
	
}
