package com.array.practice;
import java.util.*;

public class AddingElement {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i = 0;i<arr.length;i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("Enter element: ");
		int ele = sc.nextInt();
		int brr[] = new int[n+1];
		
		for(int i=0;i<arr.length;i++) {
			brr[i] = arr[i];
		}
		brr[n] = ele;
		
		System.out.println(Arrays.toString(brr));
		

	}

}
