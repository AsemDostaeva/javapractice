package com.java.class12;

import java.util.Scanner;

//Create a function that return true or false and will let us know if we can sleepIn.
//it should take 2 params - one to know if's a weekday
//another param to know if it's a vacation.
// We sleep in if it is not a weekday, or we're on vacation. Return true if we sleep in.
public class MethodsIntro {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Can you sleep in?");
        System.out.println("Today is weekday or vacation?");
        String sleepIn = sc.nextLine();
        boolean sleep = trueOrFalse(sleepIn);
        System.out.println(sleep);



    }
    public static boolean trueOrFalse (String sleepIn){
        if(sleepIn.equalsIgnoreCase("weekday")){
            return false;
        } else if (sleepIn.equalsIgnoreCase("vacation")){
            return true;
        } else return false;
    }

}
