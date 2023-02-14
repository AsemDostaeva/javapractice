package com.java.class17;

import java.util.Scanner;

public class WhileLoop4 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        String str = input.nextLine();
        int i = 0;
        int j = str.length()-1;


        while (i <= 0) {
            if (str.charAt(i) == str.charAt(j)){
                System.out.println(str + " is palindrome.");
            } else {
                System.out.println(str + " is not palindrome.");
            }
            j++;
            i++;


        }

    }
}
