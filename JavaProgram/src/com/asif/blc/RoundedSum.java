package com.asif.blc;

public class RoundedSum 
{

	public static int sumOfRoundedValues(int x,int y,int z) {
		
		if((x%10)>5) {
			x=((x/10)+1)*10;
		}
		else x=(x/10)*10;
		
		if((y%10)>5) {
			y=((y/10)+1)*10;
		}
		else y=(y/10)*10;
		
		if((z%10)>5) {
			z=((z/10)+1)*10;
		}
		else x=(z/10)*10;
		
		int sum=x+y+z;
		
		return sum;
		
		
	}
}
