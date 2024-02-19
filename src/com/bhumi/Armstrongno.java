package com.bhumi;
import java.util.Scanner;
import java.lang.Math;
public class Armstrongno {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int digit;
        System.out.println("Enter number:");
        digit = input.nextInt();
        int num=digit;
        int count = 0;
        double sum = 0;
        for (; num != 0; num = num / 10) {
            count++;
        }
        num=digit;
        System.out.println(count + " No. of digits");
        for (; num != 0; num = num / 10) {
            int r = num % 10;
            sum += Math.pow(r, count);

        }

        if (digit == sum) {
            System.out.println( digit + "is armstrong no.");
             }
        else {
            System.out.println(digit + "  is not an armstrong no.");
        }
    }
}

