package com.oop.blc;

public class BookDetails {

	int bookid;
	String bookname;
	double bookprice;
	
	
	public void setBookDetails(int id,String name,double price) {
		
		bookid = id;
		bookname = name;
		bookprice=price;
	}
	
	public void getBookDetails() {
		
		System.out.println(bookid+" id whose name is "+bookname+" set a price of "+bookprice);
	}
	
	
}
