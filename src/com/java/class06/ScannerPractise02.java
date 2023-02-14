package com.java.class06;
import java.util.Scanner;
public class ScannerPractise02 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Please enter your username:");
        String username = input.nextLine();

        System.out.println("Please enter your password:");
        String passwd = input.nextLine();


        if (username .equalsIgnoreCase("best@devx.com") && passwd .equals("Fall2022")){
            System.out.println("Login Successfully ");
        }else {
            System.out.println("login Unsuccessfully ");
        }

    }
}
