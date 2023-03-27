package com.abhi;

import java.util.Scanner;
//Area Of Triangle

public class AreaOfTriangle {
    public static void main(String[] args) {
        System.out.println("Enter Base and height of Triangle respectively: ");
        Scanner input = new Scanner(System.in);
        float base = input.nextFloat();
        float height = input.nextFloat();
        double area = 1.0/2 * base * height;
        System.out.println("The Area of Triangle is "+ area);
    }
}
