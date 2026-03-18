package logicbuilding.conditionalthinking;

import java.util.Scanner;

public class NegativePositive {

	public static void main(String[] args) {

		 Scanner sc = new Scanner(System.in);

	        System.out.println("Enter a number:");
	        int n = Integer.parseInt(sc.nextLine());

	        System.out.println("Number is " + n);

	        if (n > 0) {
	            System.out.println("The number is Positive");
	        } else if (n < 0) {
	            System.out.println("The number is Negative");
	        } else {
	            System.out.println("The number is Zero");
	        }

	        sc.close();
		

}
}
