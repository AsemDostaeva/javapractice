package com.java.class08;
import java.util.Scanner;

public class NumberOfDaysInEachMonth {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("What is your gender? M or F");
        char gender = input.next().charAt(0);

        if (gender =='M' || gender == 'm'){
            System.out.println("Work hard");
        }
        else if (gender== 'F' || gender == 'f'){
            System.out.println("Work harder");
        }
        else {
            System.out.println("Wrong input");
        }



    }
}
