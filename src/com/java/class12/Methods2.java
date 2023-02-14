package com.java.class12;
/*Given two int values, return their sum. Unless the two values are the same,
then return double their sum.*/
/*|Given 2 int values, return true if either of them is in the range 10..20 inclusive.*/

import java.util.Scanner;

public class Methods2 {

    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Please enter two integer: ");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        System.out.println(calculateSum(num1, num2));

        System.out.println("Please enter two integer: ");
        int n1 = input.nextInt();
        int n2 = input.nextInt();
        System.out.println(giveTrueOrFalse(n1, n2));


    }
    public static int calculateSum (int num1, int num2){
        if(num1==num2){
            return (num1+num2)*2;
        } else {
            return num1+num2;
        }
    }
    public static boolean giveTrueOrFalse (int n1, int n2){
        return  ((n1 >= 10 && n1 <=20) || (n2 >= 10 && n2 <=20));
    }
}
