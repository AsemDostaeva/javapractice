package com.java.class12;

import java.util.Scanner;

public class MethodsIntroHW3 {
     /*3.   Create a method that takes a boolean indicating whether
     someone is a member of a loyalty program
    and a double representing the cost of a purchase, and returns
    a double representing the final cost of
    the purchase after applying a discount. If the customer is a
    loyalty customer apply 10% discount.*/

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the cost of the purchase: ");
        double cost = input.nextDouble();
        System.out.print("Are you a loyalty member? (true or false): ");
        boolean member = input.nextBoolean();
        System.out.println("Your final cost is "+calculateFinalCost(member, cost));
    }
    public static double calculateFinalCost (boolean member, double cost){
        if (member){
            return cost - (cost * 0.1);
        } else {
            return cost;
        }
    }


}
