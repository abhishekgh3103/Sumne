package com.abhi;

import java.util.Scanner;

public class SumProduct {
    //Write a program to print the sum of two numbers entered by user by defining your own method.

    //Define a method that returns the product of two numbers entered by user.
    public static void main(String[] args) {
        System.out.println("Enter two numbers: ");
        Scanner input = new Scanner(System.in);
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        System.out.println("The sum of two numbers is "+Sum(num1,num2));
        System.out.println("The Product of two numbers is "+Prod(num1,num2));
    }
    static int Sum(int n1, int n2){
        return n1+n2;
    }
    static int Prod(int n1, int n2){
        return n1*n2;
    }
}
