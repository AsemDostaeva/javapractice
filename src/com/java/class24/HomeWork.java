package com.java.class24;

import java.util.Scanner;

public class HomeWork {

    public static void main(String[] args) {
        //1. Write a program to get two 2D arrays from the user and print the sum of it
        Scanner input = new Scanner(System.in);
        int intArray1 [] [] = new int [3] [3];
        int intArray2 [] [] = new int [3] [3];
        System.out.println("Enter numbers for the first array: ");
        for (int i = 0; i < intArray1.length; i++){
            for (int j = 0; j < intArray1.length; j++){
                intArray1[i][j] = input.nextInt();
            }
        }
        System.out.println("Enter numbers for the second array: ");
        for (int i = 0; i < intArray2.length; i++){
            for (int j = 0; j < intArray2.length; j++){
                intArray2[i][j] = input.nextInt();
            }
        }
        int sum [][] = new int [3] [3];
        for (int i = 0; i <3; i++){
            for (int j = 0; j < 3; j++){
                sum[i][j] = intArray1[i][j] + intArray2[i][j];
                System.out.print(sum[i][j]+" ");
            }
            System.out.println();
        }
    }
}
