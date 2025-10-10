package com.oop.elc;

import java.util.Scanner;

import com.oop.blc.ProductDetails;

public class Product {

	public static void main(String[] args) {
		
		ProductDetails pd=new ProductDetails();
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("ENter product id: ");
		int id=Integer.parseInt(sc.nextLine());
		System.out.println("ENter product name: ");
		String name = sc.nextLine();
		System.out.println("ENter product price: ");
		double price = Double.parseDouble(sc.nextLine());
		
		
		pd.setProductData(id, name, price);
		pd.getProductInfo();
		
		sc.close();

	}

}
