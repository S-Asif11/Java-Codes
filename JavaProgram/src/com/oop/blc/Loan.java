package com.oop.blc;

public class Loan {
	
	 private double principal;
	 private double interestRate;
	 private int durationMonths;
	 
	 public Loan(double principal,double interestRate,int durationMonths) {
		 
		 if(principal<=0 || interestRate<=0 || durationMonths<=0) {
			 System.err.println("Error");
		 }
		 this.principal=principal;
		 this.interestRate=interestRate;
		 this.durationMonths=durationMonths;
	 }
	 
	 public double getPrincipal() {
		 return principal;
	 }
	 public double getInterestRate() {
		 return interestRate;
	 }
	 public double getDurationMonths() {
		 return durationMonths;
	 }
	 
	 public void printLoanDData() {
		 System.out.println("Principle Amount is: "+principal);
		 System.out.println("Interest data is: "+interestRate);
		 System.out.println("Duration of month is: "+durationMonths);
	 }
	 
	 

}
