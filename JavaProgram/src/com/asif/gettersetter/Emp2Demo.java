package com.asif.gettersetter;



import java.util.Scanner;

public class Emp2Demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number: ");
        int employeeNumber=Integer.parseInt(sc.nextLine());

        System.out.println("Enter name: ");
        String employeeName=sc.nextLine();

        System.out.println("Enter salary: ");
        double employeeSalary=Double.parseDouble(sc.nextLine());

        Employee2 emp = new Employee2(employeeNumber,employeeName,employeeSalary);

        System.out.println("Employee Details:");
        System.out.println(emp);

        System.out.println("Enter Increment amount: ");
        double increment=Double.parseDouble(sc.nextLine());

        double salary= emp.getEmployeeSalary()+increment;
        emp.setEmployeeSalary(salary);

        System.out.println("---Updated Info---");

        System.out.println(emp);
        System.out.println(emp.getEmployeeName()+" "+emp.getEmployeeDesignation(salary)+".");

sc.close();


    }
}




class Employee2 {
    private int employeeNumber;
    private String employeeName;
    private double employeeSalary;

    public Employee2(int employeeNumber,String employeeName,double employeeSalary){
        this.employeeNumber=employeeNumber;
        this.employeeName=employeeName;
        this.employeeSalary=employeeSalary;
    }

    public int getEmployeeNumber() {
        return employeeNumber;
    }

    public void setEmployeeNumber(int employeeNumber) {
        this.employeeNumber = employeeNumber;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public double getEmployeeSalary() {
        return employeeSalary;
    }

    public void setEmployeeSalary(double employeeSalary) {
        this.employeeSalary = employeeSalary;
    }

    public String getEmployeeDesignation(double salary){
        if(salary==120000){
            return "is a HR Manager.";
        }
        if (salary==90000){
            return "is a Developer";
        }
        if (salary==60000){
            return "is a Designer.";
        }
        else return "is a Tester.";
    }

    @Override
    public String toString() {
        return "Employee Details: {" +
                "employeeNumber=" + employeeNumber +
                ", employeeName='" + employeeName + '\'' +
                ", employeeSalary=" + employeeSalary +
                '}';
    }
}

