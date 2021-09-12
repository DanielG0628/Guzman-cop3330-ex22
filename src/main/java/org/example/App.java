package org.example;

/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Daniel Guzman
 */
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        //declare variables
        int num1, num2, num3;
        Scanner sc = new Scanner(System.in);

        //prompt user and scan inputs
        System.out.println("Enter the first number:");
        num1 = sc.nextInt();
        System.out.println("Enter the second number:");
        num2 = sc.nextInt();
        System.out.println("Enter the third number:");
        num3 = sc.nextInt();

        //output
        if(num1 == num2 || num2 == num3 || num1 == num3)
            System.out.println("Enter numbers that are not equal to each other.");
        else{
            if(num1 > num2 && num1 > num3)
                System.out.println("The largest number is " + num1 + ".");
            else if(num2 > num1 && num2 > num3)
                System.out.println("The largest number is " + num2 + ".");
            else
                System.out.println("The largest number is " + num3 + ".");
        }

        //close scanner
        sc.close();
    }
}
