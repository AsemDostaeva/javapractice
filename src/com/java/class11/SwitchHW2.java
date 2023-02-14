package com.java.class11;
import java.util.Scanner;

public class SwitchHW2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter an operator (“+”, “-”, “*”, “/”): ");
        String operator = input.nextLine();
        System.out.println("Please enter two numbers: ");
        System.out.print("The first number: ");
        int num1 = input.nextInt();
        System.out.print("The second number: ");
        int num2 = input.nextInt();

        switch (operator) {
                case "+":
                    System.out.println(num1+num2);
                    break;
                case "-":
                    System.out.println(num1-num2);
                    break;
                case "*":
                    System.out.println(num1*num2);
                    break;
                case "/":
                    if(num2==0||num1==0) System.out.println("Division by zero is not allowed");
                    else System.out.println(num1/num2);
                    break;
                default:
                    System.out.println("Wrong input");
            }

        }
    }

