package com.java.class08;

public class ElseIf {
    public static void main(String[] args) {
        boolean hasLicence= false;
        int speedLimit = 90;

        if (hasLicence && speedLimit<80){
            System.out.println("Have a safe journey!");
        }
        else if (hasLicence && speedLimit>80) {
            System.out.println("Here is your speeding ticket");
        }
        else if (!hasLicence && speedLimit<80){
            System.out.println("We have to tow your car");
        }
        else if (!hasLicence && speedLimit>80){
            System.out.println("You must appear in the court");
        }

    }
}
