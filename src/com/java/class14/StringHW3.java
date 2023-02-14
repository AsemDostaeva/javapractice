package com.java.class14;
/*Given a string of any length, return a new string where the last 2 chars, if present,
are swapped, so “coding” yields “codign”.
lastTwo(“coding”) → “codign”
lastTwo(“cat”) → “cta”
lastTwo(“ab”) → “ba”*/

import java.util.Scanner;

public class StringHW3 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a String: ");
        String str = input.nextLine();
        System.out.println(replaceTwoChars(str));



    }
    public static String replaceTwoChars (String str){
        str = str.substring(0, str.length()-2) + str.charAt(str.length()-1) + str.charAt(str.length()-2);
        return str;

    }
}
