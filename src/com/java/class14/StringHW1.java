package com.java.class14;
/*Write a method that takes a string and returns true if the string starts with “hi”
and false otherwise.
 */

import java.util.Scanner;

public class StringHW1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a sentence to know if your sentence starts with \"hi\": ");
        String str = input.nextLine();
        System.out.println(giveTrue(str));


    }
    public static boolean giveTrue (String str){
        return str.substring(0, 2).equalsIgnoreCase("hi");
    }
}
//(int i, int j-1)
//String substring (int i): Return the substring
// from the ith index character to end.
