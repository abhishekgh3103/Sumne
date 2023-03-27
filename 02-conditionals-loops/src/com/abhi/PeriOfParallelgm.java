package com.abhi;

import java.util.Scanner;

public class PeriOfParallelgm {
    public static void main(String[] args) {
        System.out.println("Enter two sides of parallelogram: ");
        Scanner input = new Scanner(System.in);
        float side1 = input.nextFloat();
        float side2 = input.nextFloat();
        double perim = 2*(side1+side2);
        System.out.println("The perimeter of Parallelogram is "+perim);
    }
}
