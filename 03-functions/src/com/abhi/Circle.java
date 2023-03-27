package com.abhi;

import java.util.Scanner;

public class Circle {
    //Write a program to print the circumference and area of a circle of radius entered by user by defining your own method.
    public static void main(String[] args) {
        System.out.print("Enter the radius of Circle: ");
        Scanner input = new Scanner(System.in);
        float radius = input.nextFloat();
        System.out.println("The Circumference of circle is "+circum(radius));
        System.out.println("The Area of circle is "+area(radius));
    }
    static double circum(float r){
        return 2*3.14*r;
    }
    static double area(float r){
        return 3.14*r*r;
    }
}
