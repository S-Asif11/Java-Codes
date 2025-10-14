package com.oop.elc;

import java.util.Scanner;

import com.oop.blc.Bank;

public class BankCustomer {

	public static void main(String[] args) {
		
		Bank b=new Bank();
		
		System.out.println("======Welcome to "+Bank.bankName+"======");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Customer name: ");
		String name=sc.nextLine();
		
		System.out.println("Enter Account number: ");
		int accNumber=Integer.parseInt(sc.nextLine());
		
		System.out.println("Enter amount number: ");
		double balance=Double.parseDouble(sc.nextLine());
		
		b.setCustomerDetails(name, accNumber, balance);
		
		while(true) {System.out.println("\n===== MENU =====");
        System.out.println("1. Deposit");
        System.out.println("2. Withdraw");
        System.out.println("3. Check Balance");
        System.out.println("4. Display Customer Details");
        System.out.println("5. Exit");
        System.out.print("Enter your choice: ");
        
        int choice = Integer.parseInt(sc.nextLine());
        
        switch(choice) {
        case 1: System.out.println("Enter deposit amount :");
        double da=Double.parseDouble(sc.nextLine());
        b.deposit(da);
        break;
        
        case 2: System.out.println("Enter withdrawl amount :");
        double wa=Double.parseDouble(sc.nextLine());
        b.withdraw(wa);
        break;
        
        case 3: System.out.println("Current balance :"+b.getCurrentBalance());
    
        break;
        
        case 4: System.out.println("Customer [ "+b.displayDetails()+" ]");
        break;
        
        case 5 : System.out.println("Thank you for banking with ICICI Bank");
        break;
        
        default:
            System.out.println("Invalid choice! Please try again.");
        
        }
		}

		
		
		
		
	}

}
