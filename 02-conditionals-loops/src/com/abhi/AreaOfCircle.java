package com.abhi;

import java.util.Scanner;

public class AreaOfCircle {
    //Area Of Circle Java Program

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Radius: ");
        float radius = input.nextFloat();
        double Area = 3.14 * radius * radius;
        System.out.println("The Area of Circle is " +Area);
    }
}
