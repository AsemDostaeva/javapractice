package com.java.class23;

import java.util.Scanner;

public class Array {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        String [] names = new String[5];
//        System.out.println("Please enter 5 names: ");
//
//        for (int i = 0; i < names.length; i++){
//            names[i] = input.nextLine().trim();
//        }
//        for (int j = 0; j < names.length; j++){
//            System.out.println("Length of "+names[j]+" is "+names[j].length());
//        }


        String fruits [] = new String [8];
        System.out.println("Please enter 8 fruits:");
        boolean duplicate;

        for (int i = 0; i < fruits.length; i++){
            fruits[i] = input.nextLine().trim();
        }
        System.out.println("Duplicate fruits: ");
        for (int i = 0; i < fruits.length; i++) {
            for (int j = i + 1; j < fruits.length; j++) {
                if (fruits[i].equals(fruits[j]) && i != j) {
                    System.out.println(fruits[i]);
                    break;
                }
            }
        }

    }
}
