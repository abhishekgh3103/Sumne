package com.abhi;

import java.util.Scanner;
//Take name as input and print a greeting message for that particular name.

public class Greeting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter your name: ");
        String name = input.next();
        System.out.println("Greetings "+name+"!");
    }
}
