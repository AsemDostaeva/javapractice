package com.java.class24;

import java.util.Scanner;

public class HomeWork2 {

    public static void main(String[] args) {
        //Write a program to find the sum of array elements using for-each loop
        Scanner input = new Scanner(System.in);
        System.out.print("How many numbers do you want to input?: ");
        int number = input.nextInt();

        int[] intArray = new int[number];
        System.out.print("Enter numbers: ");
        for (int i = 0; i < number; i++){
            intArray[i] = input.nextInt();
        }
        int sum = 0;
        for (int i : intArray){
            sum += i;
        }
        System.out.println(sum);
    }
}
