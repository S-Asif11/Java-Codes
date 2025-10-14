package com.oop.blc;

public class Bank {
	
	private String customerName;
	private int accountNumber;
	private double currentBalance;
	
	public static String bankName="ICSC";
	public static String bankAddress="Hyderabad";
	public static String bankIFSCCode="ICSC012345";
	
	public void setCustomerDetails(String name,int accNumber,double balance)
	{
		
		customerName=name;
		accountNumber=accNumber;
		currentBalance=balance;
		
		if(balance<=0) {
			System.err.println("Error");
		}	
		
		System.out.println("Customer Account Created Succesfully...");
	}
	
	public void withdraw(double amount) {
		if(amount>currentBalance) {
			System.err.println("You have insufficient balance");
		}
		else if (amount <= 0) {
            System.out.println("Withdrawal amount should be greater than zero!");
            System.exit(0);}
		
		else 
		{currentBalance-=amount;
			System.out.println("Withdrawl Successfull!! "+amount+"debited");
			
		}
	}
	
	public void deposit(double amount) {
		if(amount<=0) {
			System.err.println("Amount should be greater than 0");
		}
		else 
		{currentBalance+=amount;
			System.out.println("Deposit Succesfull !!!"+amount+"creadited");
		}
	}
	
	public double getCurrentBalance() {
		
		return currentBalance;
		
	
	}
	
	public String displayDetails() {
		
		return "Name= "+customerName 
		+"Account number: "+accountNumber+"Balance: "+currentBalance;
		
		
		
	}

}
