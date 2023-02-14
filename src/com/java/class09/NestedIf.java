package com.java.class09;
import java.util.Scanner;
// Get salary and age from user
// 1. If age is less than 18 then print you're not eligible
// 2. If age is more than or equal 18 and salary is less than 5000
// then print 'Sorry, you need work hard to get credit card'
// 3. If age is more than or equal 18 and salary is greater than
// or equal 5000 then print you're eligible
// 4. If age is more than or equal 18 and salary is greater than
// or equal to 20000 then print you'll get free credit card

public class NestedIf {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("How old are you? ");
        int age = input.nextInt();
        System.out.print("How much is your salary? ");
        int salary = input.nextInt();

        if (age < 18) {
            System.out.println("You are not eligible");
        } else {
            if (salary < 5000) {
                System.out.println("Sorry, you need work hard to get credit card");
            } else if (salary > 5000 && salary < 20000 ) {
                System.out.println("You are eligible");
            } else if (salary >= 20000) {
                System.out.println("You'll get free credit card");
            }
        }

    }
}

