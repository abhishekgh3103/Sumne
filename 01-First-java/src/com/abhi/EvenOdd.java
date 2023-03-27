package com.abhi;

import java.util.Scanner;
//Write a program to print whether a number is even or odd, also take input from the user.

public class EvenOdd {

    public static void main(String[] args) {
	// write your code here
        //System.out.println("Hello there everyone");
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an Integer to check for even or odd");
        int num = input.nextInt();
        if (num % 2 == 0){
            System.out.println(num + " is Even number");
        }
        else {
            System.out.println(num + " is odd number");
        }
    }

}
