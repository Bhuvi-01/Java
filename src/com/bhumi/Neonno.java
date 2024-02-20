package com.bhumi;
import java.util.Scanner;
import java.lang.Math;

public class Neonno {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.println("Enter number");
        int num=input.nextInt();
        int digit= (int) Math.pow(num,2);
        int temp=0;
        for(;digit!=0;digit=digit/10){
             temp+=digit%10;
        }
        if (temp==num)
        {
            System.out.println(num + "is neon number");
        }
        else {
            System.out.println(num + "is not a neon number");
        }
    }
}
