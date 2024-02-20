package com.bhumi;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("Input the value for sum:");
        Scanner S=new Scanner(System.in);
        int a=S.nextInt();
        int b=S.nextInt();
        int c=S.nextInt();
        int sum=a+b+c;
        System.out.println("The sum is");
        System.out.println(sum);
    }
}