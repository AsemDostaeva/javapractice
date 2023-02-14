package com.java.class12;
        /*1Create a method that takes a person's height as a double (in meters) and returns their
          height in feet and inches. Google the formula.

        2.    Create a method that takes a char representing a grade (A, B, C, D, or F) and returns a boolean
        indicating whether the grade is passing or failing. A and B are passing, C,D,F are failing.
        3.   Create a method that takes a boolean indicating whether someone is a member of a loyalty program
        and a double representing the cost of a purchase, and returns a double representing the final cost of
        the purchase after applying a discount. If the customer is a loyalty customer apply 10% discount.*/

import java.util.Scanner;

public class MethodsIntroHomeWork {
    public static void main(String[] args) {
        System.out.print("Please enter your height in meter to convert it to feet and inches: ");
        Scanner input = new Scanner(System.in);
        double heightInMeter = input.nextDouble();
        double feet = convertHeight(heightInMeter);
        double inch = convertHeight2(heightInMeter);
        System.out.println("Your height is "+ feet+ " feet and "+inch+ " inches");
    }
    public static double convertHeight(double heightInMeter){
        double feet = heightInMeter * 3.281;
        return feet;
    }
    public static double convertHeight2 (double heightInMeter){
        double inch = heightInMeter *  39.37;
        return inch;
    }
}
