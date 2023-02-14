package com.java.SelfPractice;
import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {
        System.out.println("Task 1 =======================");
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter 3-digit number: ");
        int num = input.nextInt();

        int num1= num/10;
        int num2= num1/10;
        int num3= num1%10;
        int num4= num%10;

        int num5= num2+num3+num4;
        System.out.println(num5);
        System.out.println("================================");
        System.out.println("Task 2");

        /*>>>the program should give us whether the number is even or not even if it is an even number + 1

         for example:

          input: 4
          output: 4+1

          input: 3
          output: 3*/
        System.out.println("Please enter the number: ");
        int a = input.nextInt();
        if(a%2==0){
            System.out.println(a+ " +1");
        } else{
            System.out.println(a);
        }

    }
}
