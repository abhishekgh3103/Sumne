package com.abhi;

import java.util.Scanner;

public class AreaOfRhombus {
    public static void main(String[] args) {
        System.out.println("Enter two diagonals of Rhombus: ");
        Scanner input = new Scanner(System.in);
        float d1 = input.nextFloat();
        float d2 = input.nextFloat();
        double area = (d1 * d2)/2;
        System.out.println("The Area of Rhombus is "+ area);
    }
}
