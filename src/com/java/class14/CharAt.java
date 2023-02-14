package com.java.class14;

import java.util.Scanner;

public class CharAt {

    public static void main(String[] args) {
        String str = "wedevx.co";
        System.out.println(str.charAt(1));

        String str2 = "hello world";
        System.out.println(str2.charAt(5));

        String str3 = "superstar";
        System.out.println(str3.charAt(7));

        String str5 = "Hello World!!!";
        System.out.println(str5.length());

        Scanner input = new Scanner(System.in);
        String str4 = input.nextLine();
        System.out.println(lastChar(str4));




    }
    public static char lastChar (String str4){
        return str4.charAt(str4.length()-1);
    }
}
//When we are talking about position, so we start to count from 0 (ith index)
//When we are counting the letters, we start from 1
