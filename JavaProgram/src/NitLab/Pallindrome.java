package NitLab;

public class Pallindrome {

	public static void main(String[] args) {
		int n = Integer.parseInt(args[0]);
		int t=n;
		
		int digit=0;
		int rev = 0;
		
		for( ;t!=0;t=t/10) {
			
			digit=t%10;
			rev=rev*10+digit;
			
		}
		if(rev == n) {
			System.out.println("Number is Pallindrome");
		}
		else System.out.println("Not a Pallindrome");

	}

}
