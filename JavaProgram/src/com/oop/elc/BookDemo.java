package com.oop.elc;

import java.util.Scanner;

import com.oop.blc.BookDetails;

public class BookDemo {
	
	public static void main(String[] args) {
		
		BookDetails bd = new BookDetails();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("ENter book id: ");
		int id=Integer.parseInt(sc.nextLine());
		System.out.println("ENter book name: ");
		String name=sc.nextLine();
		System.out.println("ENter book price: ");
		double price = Double.parseDouble(sc.nextLine());
		
		bd.setBookDetails(id, name, price);
		bd.getBookDetails();
		
		
		
	}

}
