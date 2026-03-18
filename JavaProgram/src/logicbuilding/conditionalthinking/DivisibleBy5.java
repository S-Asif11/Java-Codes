package logicbuilding.conditionalthinking;

import java.util.Scanner;

public class DivisibleBy5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number:");
        int n = Integer.parseInt(sc.nextLine());
        
        if(n%5 ==0) {
        	System.out.println("Number is divisible by 5");
        }
        else
        	System.out.println("Not divisible");
        sc.close();

	}

}
