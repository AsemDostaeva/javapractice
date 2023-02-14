package com.java.class24;

import java.util.Scanner;

public class HomeWork3 {

    public static void main(String[] args) {
        //Program to print the sum of the smallest and greatest number from the array using for-each loop
        Scanner input = new Scanner(System.in);
        System.out.print("How many numbers do you want to input?: ");
        int number = input.nextInt();

        int[] intArray = new int[number];
        System.out.print("Enter numbers: ");
        for (int i = 0; i < number; i++){
            intArray[i] = input.nextInt();
        }
        int biggest = intArray[0];
        int smallest = intArray[0];
        for (int i : intArray) {
            if (biggest > i) {
                biggest = i;
            } else if (smallest < i) {
                smallest = i;
            }
        }
        System.out.println("The sum of "+smallest+" and "+biggest+" is "+(smallest+biggest));
    }
}
