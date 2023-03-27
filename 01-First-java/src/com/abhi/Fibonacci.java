package com.abhi;

import java.util.Scanner;
//To calculate Fibonacci Series up to n numbers.

public class Fibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = input.nextInt();
        fibonacci(n);
    }
    static void fibonacci(int n){
        int a = 0;
        int b = 1;
        int c = 0;
        for (int i = 0; i < n;i++){
            c = a + b;
            a = b;
            b = c;
            System.out.print( c +" " );//prints every fibonacci number till n-series
        }
        System.out.println();
        System.out.print( c +" " );//prints the fibonacci number of nth position
    }
}
