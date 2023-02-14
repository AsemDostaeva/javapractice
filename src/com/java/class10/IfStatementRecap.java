package com.java.class10;


import java.util.Scanner;

public class IfStatementRecap {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter 3 number:");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int num3 = input.nextInt();

        if (num1>num2 && num1>num3){
            System.out.println("The first number is the largest: "+num1);
        } else if (num2>num1 && num2>num3){
            System.out.println("The second number is the largest: "+num2);
        } else {
            System.out.println("The third number is the largest: "+num3);
        }
    }
}
