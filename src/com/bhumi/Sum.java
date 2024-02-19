package com.bhumi;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter three numbers: ");
        float a=sc.nextInt();
        float b=sc.nextInt();
        float c=sc.nextFloat();
        float sum=a+b+c;
        System.out.println("The sum is : " + sum);
    }
}
