package com.java.class10;
import java.util.Scanner;

public class IfNestedHW3 {
    /*Nested If statements homework 3:
Write a bank app to calculate interest rates on loans:
take input for loanAmount in $,  credit score between 300-850.
If the loan amount is less than $10,000 and the credit score is less than 600, the interest rate is set to 15%.
If the loan amount is less than $10,000 and the credit score is 600 or higher, the interest rate is set to 10%.
If the loan amount is $10,000 or higher and the credit score is less than 600, the interest rate is set to 12%.
If the loan amount is $10,000 or higher and the credit score is 600 or higher, the interest rate is set to 8%.*/

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter your loan amount in $: ");
        int loan= input.nextInt();
        System.out.print("Please enter your credit score (between 300-850): ");
        int credit = input.nextInt();

        if(loan<10000){
            if(credit<600){
                System.out.println("The interest rate is set to 15%.");
            } else if (credit>=600){
                System.out.println("The interest rate is set to 10%.");
            }
        } else if (loan>=10000){
            if (credit<600){
                System.out.println("The interest rate is set to 12%.");
            } else if (credit>=600){
                System.out.println("The interest rate is set to 8%.");
            }
        }
    }
}
