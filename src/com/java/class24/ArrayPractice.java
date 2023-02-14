package com.java.class24;

import java.util.Scanner;

public class ArrayPractice {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int gr = 0;
        int[][] myIntArray = new int[3][3];
        for (int i = 0; i < myIntArray.length; i++) {
            System.out.println("Please enter 3 numbers for " + (i + 1) + " row:");
            for (int j = 0; j < myIntArray[i].length; j++) {
                myIntArray[i][j] = input.nextInt();
            }
        }

        for (int i = 0; i < myIntArray.length; i++) {
            gr = myIntArray[i][0];
            for (int h = 0; h < myIntArray[i].length; h++) {
                if (myIntArray[i][h] > gr) {
                    gr = myIntArray[i][h];
                }
            }
            System.out.println("The greatest: " + gr);
        }

    }
}
