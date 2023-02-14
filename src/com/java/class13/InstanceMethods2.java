package com.java.class13;
/*Given two non-negative int values, return true if they have the same last digit,
 such as with 27 and 57. Note that the % “mod” operator computes remainders, so 17 % 10 is 7.
 */
/*create a method that takes a non-negative int.
Return true if the given non-negative number is a multiple of 3 or a multiple of 5. Use the % “mod” operator*/


import java.util.Scanner;

public class InstanceMethods2 {

    public static void main(String[] args) {
        InstanceMethods2 modula = new InstanceMethods2();
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter 2 integers: ");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        System.out.println(modula.giveBoolean(num1, num2 ));

        System.out.print("Please enter non-negative number: ");
        int num = input.nextInt();
        System.out.println(modula.give(num));

        int a = input.nextInt();
        int b = input.nextInt();
        System.out.println(modula.tenOrNot(a, b));

    }
    /*Create a method that takes 2 integers,
Given 2 ints, a and b, return true if one if them is 10 or if their sum is 10.*/
    public boolean giveBoolean (int num1, int num2){
        if (num1 > 0 && num2 > 0){
            return num1 % 10 == num2 % 10;
        } return false;
    }
    public boolean give (int num){
        if (num > 0){
           return num % 3 == 0 || num % 5 == 0;
        } return false;
    }
    public boolean tenOrNot(int a, int b){
        return a==10 || b==10 || a+b==10;
    }
}
