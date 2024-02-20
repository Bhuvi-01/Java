package com.bhumi;
import java.util.Scanner;
public class Conditionals {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Enter Your Salary");
        int salary=input.nextInt();
        if(salary>10_000)
        {
            System.out.println("Bonus is being added of rs. 2000");
            salary+=2000;
            System.out.println("The salary is: "+ salary);

        }
//        else{
//            System.out.println("Bonus is being added of rs. 1000");
//            salary+=1000;
//            System.out.println("The salary is now :"+ salary);
//        }
        else {

            System.out.println("Bonus is being added of rs. 1000");
            salary+=1000;
            System.out.println("The salary is: "+ salary);

        }
        }
    }