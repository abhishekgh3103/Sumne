package com.abhi;

import java.util.Scanner;
//A person is eligible to vote if his/her age is greater than or equal to 18. Define a method to find out if he/she is eligible to vote.

public class Vote {
    public static void main(String[] args) {
        System.out.print("Enter the age: ");
        Scanner input = new Scanner(System.in);
        int age = input.nextInt();
        System.out.println(VoteAge(age));
    }
    static String VoteAge(int age){
        if (age >= 18){
            return "He/She is eligible to Vote";
        }else return "He/She is not eligible to Vote";
    }
}
