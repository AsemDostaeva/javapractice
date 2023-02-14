package com.java.class22;
import java.util.Scanner;

public class ArraysIntro {

    public static void main(String[] args) {
        int listOfData[] = new int[8];
        Scanner input = new Scanner (System.in);
        System.out.println("Please enter 8 numbers");

        for (int i=0; i<listOfData. length; i++){
            listOfData[i] = input.nextInt();
        }

        System.out.println("Please enter target number we need find index ");
        int targetNumber = input.nextInt();

        for (int i = 0; i < listOfData. length; i++) {
            if (listOfData[i] == targetNumber) {
                System.out.println(i);
            }
        }
    }
}
