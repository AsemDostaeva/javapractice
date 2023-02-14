package com.java.class07;
import java.util.Scanner;

public class Ifhomework {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("HW-1");
        System.out.println("How many Java exercises do solve per day?");
        int a = input.nextInt();

        if (a < 3) {
            System.out.println("You are too lazy!");
        }
        if (a >= 3 && a < 5) {
            System.out.println("Good job, but you should do better! ");
        }
        if (a >= 5) {
            System.out.println("Great job! You are on the right track! ");
        }

        System.out.println("=================================");
        System.out.println("HW-2");
        System.out.println("Input three numbers");
        System.out.println("Input 1 ");
        int num1 = input.nextInt();
        System.out.println("Input 2");
        int num2 = input.nextInt();
        System.out.println("Input 3");
        int num3 = input.nextInt();
        double av = (num1 + num2 + num3) / 3;
        System.out.println("Output " + av);

        System.out.println("===================================");
        System.out.println("HW-3");
        System.out.println("Welcome to the Delta Air Lines!");
        System.out.println("Are you travelling from connecting flight(true/false)?");
        boolean travel = input.nextBoolean();
        if (travel == true) {
            System.out.println("Enjoy your flight!");
        } else {
            System.out.println("Please proceed to the security check");
            System.out.println("Enjoy your flight!");


            System.out.println("===================================");
            System.out.println("HW-3");
            System.out.println("Welcome to the Delta Air Lines!");
            System.out.println("Are you travelling from connecting flight?");
            input.nextLine();
            String answ = input.nextLine();
            if (answ.equals("yes")) {
                System.out.println("Enjoy your flight!");
            } else {
                System.out.println("Please proceed to the security check");
                System.out.println("Enjoy your flight!");
            }


        }
    }
}
