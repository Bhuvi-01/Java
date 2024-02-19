package com.bhumi;
import java.util.Scanner;
public class Fibosum {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the term upto which you want sum");
        int n= input.nextInt();
        int a=0;
        int b=1;
        int sum=a+b;
        int add=a+b;
        System.out.println("Series is: ");
        System.out.println(a);
        System.out.println(b);
        for(int i=2;i<n;i++){
            a=b;
            b=sum;
            sum=a+b;
            add+=a+b;
            System.out.println(sum);
        }
        System.out.println("The final sum is: " + add);
    }
}
