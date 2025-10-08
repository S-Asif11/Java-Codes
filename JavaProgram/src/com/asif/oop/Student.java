package com.asif.oop;

public class Student {
	int rollNumber;		//Initializing the variables
    String name;		//Initializing the variables
    double height;		//Initializing the variables

    public void talk() 
    
    {
    	//write the logics inside a non static method
    	
        System.out.println("Hello learner, I am :" + name);
        System.out.println("My roll number is " + rollNumber);
        System.out.println("My height is " + height);
        
    }

    public void writeExam() 
    {
    	//write the logics inside a non static method
    	
        System.out.println("I am " + name + " every saturday I am writing exam!!!");
        
    }
}
