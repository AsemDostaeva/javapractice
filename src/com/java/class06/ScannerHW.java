package com.java.class06;
import java.util.Scanner;

public class ScannerHW {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.println("How old are you?");
        int age = input.nextInt();

        System.out.println("What is your credit score?");
        int creditScore = input.nextInt();

        input.nextLine();

        System.out.println("What is your marital status?");
        String marital = input.nextLine();


        if (age>25 && creditScore>700 && marital .equals("married")){
            System.out.println("true");
        }else {
            System.out.println("false");
        }


    }
}
