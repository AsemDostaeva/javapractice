package com.java.class13;

import java.util.Scanner;

/*As a user, I want to know if a year is a leap year, So that I can plan for an extra day on February 29th during
those years.
        Acceptance Criteria:
        All years divisible by 400 ARE leap years (so, for example, 2000 was indeed a leap year),
        All years divisible by 100 but not by 400 are NOT leap years (so, for example, 1700, 1800, and 1900 were NOT
        leap years,
        NOR will 2100 be a leap year),
        All years divisible by 4 but not by 100 ARE leap years (e.g., 2008, 2012, 2016),
        All years not divisible by 4 are NOT leap years (e.g. 2017, 2018, 2019).
        Write a method that takes an int year and return true if the year is leap, false if the year is not leap.*/
public class InstanceHW {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        InstanceHW var = new InstanceHW();
        System.out.print("Please enter the year to know if this year is leap: ");
        int year = input.nextInt();
        System.out.println(var.isLeap(year));


    }
    public boolean isLeap (int year){
        return year % 400 ==0 || year % 4 == 0 && year % 100 != 0;
    }
}
