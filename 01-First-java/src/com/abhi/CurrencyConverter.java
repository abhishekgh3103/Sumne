package com.abhi;

import java.util.Scanner;
//Input currency in rupees and output in USD.

public class CurrencyConverter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter amount in INR value: ");
        float inr = input.nextFloat();
        System.out.println("The amount in USD value is "+inr*0.012);
    }
}
