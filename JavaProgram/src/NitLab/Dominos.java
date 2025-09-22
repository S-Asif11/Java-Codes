package NitLab;

public class Dominos {

	public static void main(String[] args) {
		int cr = 60;
		int vp = 25;
		
		int item1=Integer.parseInt(args[0]);
		int item2=Integer.parseInt(args[1]);
		
		int TotalAmount=0;
		
		TotalAmount=((cr*item1)+(vp*item2))-50;
		
		System.out.println("Total Amount is: "+TotalAmount);

	}

}
