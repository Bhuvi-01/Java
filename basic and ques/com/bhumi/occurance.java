package com.bhumi;
import java.util.Scanner;
public class occurance {
    public static void main(String[] args){
        Scanner in=new Scanner (System.in);
        System.out.println("Enter your number");
        int num=in.nextInt();
        System.out.println("Which number occurance you want to check");
        int oc=in.nextInt();
        int r,count=0;
        while(num>0)
        {
            r=num%10;
            if(r==oc){
                count++;
            }
            num=num/10;
        }
        System.out.println("The occurance is:" + count);
    }
}
