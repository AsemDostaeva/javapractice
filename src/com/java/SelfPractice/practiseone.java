package com.java.SelfPractice;

import java.util.Scanner;

public class practiseone {

    public static void main(String[] args) {
        System.out.println("Where do you want to go?");

        Scanner input = new Scanner(System.in);
        String country = input.nextLine();
        travel(country);



    }
    public static void travel (String country){
        System.out.println("I want to travel to " + country);
        if (country.equalsIgnoreCase("China")){
            System.out.println("The embassy of China is awful");

        } else {
            System.out.println("OK -.-");
        }
    }
}
