package com.array.practice;

public class AvarageOfArray {
    public static  int avarage(int arr[]){
        int l = arr.length;
        int s = 0;
        int c = 0;
        int a = 0;
        for (int i = 0; i < l; i++) {

            c++;
            s+=arr[i];
        }
        a=s/c;
        return a;
    }
    public static void main(String[] args) {
        int a[] = {1,2,3,4,5};
        System.out.println(avarage(a));
    }
}
