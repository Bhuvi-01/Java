package com.bhumi;
import java.util.Scanner;

public class loops {
    public static void main(String[] args) {

        //print numbers from 1 to 5
        for(int num=1;num<=5;num++)
        {
            System.out.println(num);
        }
//        print numbers from 1 to n
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter n: ");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            System.out.println(i);
        }


        //while loops
        int num=1;
        while( num<=5)
        {
            System.out.println(num);
            num++;
        }
        //when we don't know how many times a loop is going to run we generally use while loop


        //do while loop
//        int n=1;
//        do{
//            System.out.println(n);
//            n++;
//        }while(n<=5);
        //do while loop runs at least once before checking the condition




    }
}
