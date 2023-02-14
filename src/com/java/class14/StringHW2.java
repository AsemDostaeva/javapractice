package com.java.class14;
/*Write a method that takes a string   returns a new string made of 3 copies of the last
2 chars of the original string. The string length will be at least 2.
extraEnd(“Hi”) → “HiHiHi”
extraEnd(“Hello”) → “lololo”
extraEnd(“ab”) → “ababab”*/

import java.util.Scanner;

public class StringHW2 {

    public static void main(String[] args) {
        System.out.print("Please enter any word: ");
        Scanner input = new Scanner(System.in);
        String oldString = input.nextLine();
        System.out.println(newString(oldString));

    }
    public static String newString (String oldString){
        oldString = oldString.substring(oldString.length()-2);
        return oldString + oldString + oldString;

    }
}
// history 7-2=5
//history 7-1=6