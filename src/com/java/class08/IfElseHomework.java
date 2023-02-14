package com.java.class08;
import java.util.Scanner;


public class IfElseHomework {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("HW 6.1");
        System.out.print("Enter the day of the week in number:");
        int day = input.nextInt();

        if (day==0) System.out.println("Sunday");
        else if (day==1) System.out.println("Monday");
        else if (day==2) System.out.println("Tuesday");
        else if (day==3) System.out.println("Wednesday");
        else if (day==4) System.out.println("Thursday");
        else if (day==5) System.out.println("Friday");
        else if (day==6) System.out.println("Saturday");
        else System.out.println("Try again. ");

        System.out.println("=============================");
        System.out.println("HW 6.2");
        System.out.println("Welcome to the Beverly Hills!\n"+"Are you traveling first time here(true/false)?");
        boolean travel = input.nextBoolean();
        if (travel) System.out.println("Enjoy your stay!");
        else System.out.println("You have got a 10% discount on your stay\n"+"Enjoy your stay!");

    }
}
