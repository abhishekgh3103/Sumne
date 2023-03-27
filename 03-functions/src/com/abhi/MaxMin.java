package com.abhi;

import java.util.Scanner;

public class MaxMin {
    //Define two methods to print the maximum and the minimum number respectively among three numbers entered by the user.

    public static void main(String[] args) {
	// write your code here
        System.out.println("Enter three numbers to check the maximum and minimum: ");
        Scanner input = new Scanner(System.in);
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int num3 = input.nextInt();
        System.out.println("The maximum number is "+Max(num1,num2,num3));
        System.out.println("The minimum number is "+Min(num1,num2,num3));
    }
    static int Max(int n1, int n2, int n3){
        int max = n1;
        if (n2 > max){
            max= n2;
        }
        if (n3 > max) {
            max = n3;
        }
        return max;
    }
    static int Min(int n1, int n2, int n3){
        int min = n1;
        if (n2 < min){
            min= n2;
        }
        if (n3 < min) {
            min = n3;
        }
        return min;
    }

}
