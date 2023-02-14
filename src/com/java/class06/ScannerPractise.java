package com.java.class06;
import java.util.Scanner;

public class ScannerPractise {
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);

      System.out.println("Please enter your age and hit enter");
      int age= input.nextInt();
      System.out.println("You are "+age);

        System.out.println("Please enter your credit score!");
      int creditscore= input.nextInt();
        System.out.println("Your credit score is "+creditscore);

      System.out.println("What is your marital status?");
      boolean marital = input.nextBoolean();
      System.out.println("Are you married? :"+marital);

      System.out.println("What is your name?");
      String name = input.next();
      System.out.println("Hello "+name +"!");







    }
}
