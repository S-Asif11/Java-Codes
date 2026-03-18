package logicbuilding.conditionalthinking;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		//check a number is positive negative or zero?
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = Integer.parseInt(sc.nextLine());
		
		
		if(num == 0) {
			System.out.println("Number is 0");
		}
		else if(num>0) {
			if((num/2)*2 == num) {
				System.out.println("Number is positive");
			}
			else System.out.println("number is negative");
		}
		
		else System.out.println("Number is negative");
		
		sc.close();
		

	}

}
