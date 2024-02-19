package com.bhumi;
import java.util.Scanner;

public class vowel {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        char str;
        System.out.println("Enter charcter: ");
        str = input.next().charAt(0);
        if(str=='a' || str=='e' || str=='i' || str=='o' || str=='u'||
            str=='A' || str=='E' || str=='I' || str=='O' || str=='U'){
            System.out.println(str + " is a vowel");
        }
        else{
            System.out.println(str + " is a cosonant");
        }
    }
}
