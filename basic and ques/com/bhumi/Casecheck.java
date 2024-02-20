package com.bhumi;

import java.util.Scanner;

public class Casecheck {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a character");
        char ch=sc.next().trim().charAt(0);
        //trim is used to cut down spaces and char is used to take char at index value zero

        if(ch >= 'a'  && ch <= 'z'){
            System.out.println("Lowercase");
        }
        else{
            System.out.println("Uppercase");
        }

    }
}
