package com.abhi;

import java.util.Scanner;

public class AreaOfRect {
    public static void main(String[] args) {
        System.out.println("Enter the length and breadth of Rectangle: ");
        Scanner input = new Scanner(System.in);
        float b = input.nextFloat();
        float l = input.nextFloat();
        double Area = l*b;
        System.out.println("The Area of Rectangle is "+ Area);
    }
}
