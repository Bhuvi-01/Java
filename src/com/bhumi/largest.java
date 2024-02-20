package com.bhumi;
import java.util.Scanner;
import java.lang.Math;
public class largest {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 3 numbers: ");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();

        //Find the largest of 3 numbers

//        int max=a;
//        if (b>max){
//            max=b;
//        }
//        if(c>max){
//            max=c;
//        }
//

        int max=Math.max(c,Math.max(a,b));

        System.out.println("The max number is: "+ max);

    }
}
