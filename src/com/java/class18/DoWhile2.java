package com.java.class18;

import java.util.Scanner;

public class DoWhile2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String choice;


        do {
            System.out.print("Please enter number to see square of this number: ");
            int a = input.nextInt();
            System.out.println(a * a);
            System.out.println("Do you want do it one more time? (Yes/ No)");
            input.nextLine();
            choice = input.nextLine();
        } while (choice.equalsIgnoreCase("Yes"));
    }
}
