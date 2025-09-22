package NitLab.command_lina_arg;

public class ArmstrongNumber {

	public static void main(String[] args) {
		int inp=Integer.parseInt(args[0]);
		
		int t=inp;
		int digit,sum=0;
		
		for( ;t!=0;t=t/10) {
			digit=t%10;
			sum+=(digit*digit*digit);
		}
		
		if(sum==inp) {
			System.out.println("Its a Armstrong Number");
		}
		else System.out.println("Its Not A Armstrong Number");

	}

}
