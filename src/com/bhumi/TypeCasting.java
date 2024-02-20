package com.bhumi;
import java.util.Scanner;
public class TypeCasting {
    public static void main(String[] args){
        Scanner input=new Scanner (System.in);
//        float num=input.nextFloat();
//
//        int num=(int)(23.78f);
//        System.out.println(num);  //Type Casting

        //automatic type promotions in expressions
//        int a=257;
//        byte b=(byte)(a);
//        System.out.println(b);

//        byte a=40;
//        byte b=50;
//        byte c=100;
//        int d=(a*b)/c;
//        System.out.println(d);


        int  num='a';
        System.out.println(num);   //Giving ASCII values

        System.out.println(3*3.19f);

        byte b=42;
        char c='a';
        short s=1024;
        int i=20000;
        float f=5.63f;
        double d=9.14444;

        double result=(f * b)+(i / c)-(d*s);
        System.out.println((f * b)+" "+(i / c)+ " " +(d*s));
        System.out.println(result);
    }
}
