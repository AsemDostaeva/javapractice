package com.java.SelfPractice;
/*Write a method that takes a string and returns true if the string starts with
“hi” and false otherwise.
 */

import java.util.Scanner;

public class pracrice {

    public static void main(String[] args) {


        String stringExample = "Aidai";

        System.out.println("Original string: " + stringExample);


        // Declaring a StringBuilder and converting string to StringBuilder

        StringBuilder reverseString = new StringBuilder(stringExample);


        reverseString.reverse();  // Reversing the StringBuilder


        // Converting StringBuilder to String

        String result = reverseString.toString();


        System.out.println("Reversed string: " + result); // Printing the reversed String


    }

}

//Aidai 5-5=
// 5-2=3