package com.abhi;

import java.util.Scanner;
//Take in two numbers and an operator (+, -, *, /) and calculate the value. (Use if conditions)

public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter two numbers:");
        float num1 = input.nextFloat();
        float num2 = input.nextFloat();
        System.out.println("Enter an operator:");
        char opr = input.next().charAt(0);
        String  ans = Calculate(num1, num2, opr);
        System.out.println(ans);
    }

    static String Calculate(float num1,float num2,char opr){
        if(opr == '+'){
            return String.valueOf(num1 + num2);
        } else if (opr == '-') {
            return String.valueOf(num1 - num2);
        } else if (opr == '*'){
            return String.valueOf(num1 * num2);
        } else if (opr == '/'){
            if (num2 == 0){
                return "Enter valid Denominator(Zero Error)";
            } else {
                return String.valueOf(num1/num2);
            }
        }
        else return "Enter valid Operator";
    }
}
