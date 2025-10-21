package com.oop.elc;

import java.util.Scanner;

import com.oop.blc.InventoryItem;

public class InventoryMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter item name: ");
		String itemName= sc.nextLine();
		
		System.out.println("Enter price per unit: ");
		double pricePerUnit=Double.parseDouble(sc.nextLine());
		
		System.out.println("Enter quantity in stock: ");
		int quantityInStock=Integer.parseInt(sc.nextLine());
		InventoryItem  it = new InventoryItem(itemName,pricePerUnit,quantityInStock);
		
		
		System.out.println("Item name: "+it.getItemName());
		System.out.println("Price per unit: "+it.getPricePerUnit());
		System.out.println("Quantity in stock: "+it.getQuantityInStock());
		System.out.println("Total value of the price: "+it.calculateTotalValue());
		
		while(true) {
		System.out.println("Any updation in Stock Price OR Quantity :");
		String choice = sc.nextLine().toLowerCase();
		
		
		
		
		if(choice.equalsIgnoreCase("yes")) {
			System.out.println("Enter new price per unit: ");
			double pricePerUnit1=Double.parseDouble(sc.nextLine());
			System.out.println("Enter new quantity: ");
			int quantityInStock1=Integer.parseInt(sc.nextLine());
			
			it.setPricePerUnit(pricePerUnit1);
			it.setQuantityInStock(quantityInStock1);
			
			System.out.println("Updated Inventory Item Details:");
			System.out.println("Item Name: "+itemName);
			System.out.println("Price Per Unit: "+it.getPricePerUnit());
			System.out.println("Quantity in Stock: "+it.getQuantityInStock());
			System.out.println("Total Inventory Value: "+it.calculateTotalValue());
			
			
		}
		else {
			System.out.println("Thank you for visiting the Inventory");
			System.exit(0);
			
		}
			
		
		
		}
		
		
		
	}

}
