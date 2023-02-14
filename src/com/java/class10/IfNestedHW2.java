package com.java.class10;
import java.util.Scanner;

public class IfNestedHW2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter weight of the order in lbs: ");
        double weight = input.nextDouble();
        input.nextLine();
        System.out.print("Please enter your shipping country: ");
        String destination = input.nextLine();

        if (destination.equalsIgnoreCase("USA")) {
            if (weight<2) {
                System.out.println("The shipping cost is $5.");
            } else if (weight >= 2) {
                System.out.println("The shipping cost is $: "+weight*0.5);
            }

        }  else {
            System.out.println("The shipping cost is $: "+ weight*1.5);
        }
    }
}

