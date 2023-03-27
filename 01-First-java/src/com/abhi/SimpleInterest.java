package com.abhi;

import java.util.Scanner;
//Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest.

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.print("Enter Principle amount: ");
        int principle = input.nextInt();
        System.out.print("Enter Time taken to repay (in years): ");
        int time = input.nextInt();
        System.out.print("Enter rate of interest: ");
        float rate = input.nextFloat();
        simpleInterest(principle,time,rate);
    }
    static void simpleInterest(int p,int t,float r){
        float SimpleInterest = (p*t*r)/100;
        System.out.println("The simple interest of entered amount is "+SimpleInterest);
    }
}
