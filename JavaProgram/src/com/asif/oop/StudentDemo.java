package com.asif.oop;

public class StudentDemo {
	public static void main(String[] args) {
		
		//we have to create a object as the logic methods are non static in the Student.java Class...
		
        Student raj = new Student(); //Creating a object using the 'Student' Class and variable is 'raj'.
        
        
        raj.rollNumber = 101;         //assigning the values
        raj.name = "Raj Gourav"; 	  //assigning the values
        raj.height = 5.9;			  //assigning the values

        raj.talk(); //calling the methods using object.the format is = Object Variable . method name(in which the logics are written)
        raj.writeExam(); //calling the methods using object.the format is = Object Variable . method name(in which the logics are written)

        System.out.println("---------------------");

        Student priya = new Student();
        priya.rollNumber = 201;		//assigning the values
        priya.name = "Priya";		//assigning the values
        priya.height = 5.7;			//assigning the values

        priya.talk();	//calling the methods using object.the format is = Object Variable . method name(in which the logics are written)
        priya.writeExam();	//calling the methods using object.the format is = Object Variable . method name(in which the logics are written)
    }
}
