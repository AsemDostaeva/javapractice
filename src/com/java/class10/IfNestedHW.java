package com.java.class10;
import java.util.Scanner;

public class IfNestedHW {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Choose between two options");
        System.out.println("1.Appetizer");
        System.out.println("2.Main course");

        String choice = input.nextLine();


        if (choice.equalsIgnoreCase("Appetizer") || choice.equalsIgnoreCase("1.Appetizer") || choice.equals("1")) {
            System.out.println("1.Spring Rolls");
            System.out.println("2.Egg Rolls");
            String appetizer = input.nextLine();
            if (appetizer.equalsIgnoreCase("Spring Rolls") || appetizer.equals("1")) {
                System.out.println("Spring roll ingredients");
            } else if (appetizer.equalsIgnoreCase("Egg Rolls") || appetizer.equals("2")) {
                System.out.println("Egg rolls ingredients");
            } else {
                System.out.println("Invalid appetizer choice");
            }

        } else if (choice.equalsIgnoreCase("Main Course") || choice.equals("2") || choice.equalsIgnoreCase("2.Main Course")) {
            System.out.println("1.Lagman");
            System.out.println("2.New York Rib Eye steak");
            String main = input.nextLine();
            if (main.equalsIgnoreCase("Lagman") || main.equals("1")) {
                System.out.println("Lagman ingredients");
            } else if (main.equalsIgnoreCase("New York Rib Eye steak") || main.equals("2")) {
                System.out.println("New York Rib Eye steak ingredients");
            } else {
                System.out.println("Invalid main course choice");
            }
        } else {
            System.out.println("Invalid choice");
        }

        System.out.println("Choose Drinks");
        System.out.println("1. Orange juice");
        System.out.println("2. Apple juice");
        System.out.println("3. Pineapple juice");
        String drink = input.nextLine();

        if (drink.equalsIgnoreCase("Orange juice") || drink.equals("1")) {
            System.out.println("Ingredients: Orange, sugar, ice");
        } else if (drink.equalsIgnoreCase("Apple juice, ice") || drink.equals('2')) {
            System.out.println("Ingredients: Apple, sugar");
        } else if (drink.equalsIgnoreCase("Pineapple juice, ice") || drink.equals("3")) {
            System.out.println("Ingredients: Pineapple, sugar");
        } else {
            System.out.println("Invalid input");
        }
    }
}

