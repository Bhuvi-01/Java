package com.bhumi;
import java.util.Scanner;
public class PracticeSet {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.println("Enter two numbers");
        int a= input.nextInt();
        int b=input.nextInt();
        int temp;
        System.out.println("Before swap :" + a + "   "+ b);
        temp=a;
        a=b;
        b=temp;
        System.out.println("After Swap: " + a +"   " + b);

    }
}
