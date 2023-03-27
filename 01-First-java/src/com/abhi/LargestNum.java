package com.abhi;

import java.util.Scanner;
//Take 2 numbers as input and print the largest number.

public class LargestNum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter two numbers:");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        if (num1 > num2) System.out.println(num1+" is greater than "+num2);
        else System.out.println(num2+" is greater than "+num1);
    }
}
