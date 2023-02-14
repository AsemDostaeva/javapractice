package com.java.class11;
import java.util.Scanner;
/*Write a program that takes a day of the week as input (e.g., “Monday”), and outputs the
number of days until the next weekend (i.e., either Saturday or Sunday). Use a switch statement
to implement this program.
 */
public class SwitchHW {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a day of the week: ");
        String day = input.nextLine();
        int num = 0;

        switch (day){
            case "Monday":
                num = 5; break;
            case "Tuesday":
                num = 4; break;
            case "Wednesday":
                num = 3; break;
            case "Thursday":
                num = 2; break;
            case "Friday":
                num = 1; break;
            case "Saturday":
                num = 0; break;
            case "Sunday":
                System.out.println("Today is weekend");
        }
        System.out.println("In "+num+" days will be weekend");

    }
}
