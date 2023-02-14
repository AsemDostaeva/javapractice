package com.java.class18;
/*Write a to take the opening balance and the account name from the user and display the below operations
that the user can perform, at the end ask user if they want to perform more operations and then continue
the same process until a user enters ‘NO’

Output
Welcome to the ATM Machine
Please enter your account opening balance: 1000
Please choose the operations you want to perform
1) Withdraw
2) Deposit
3) Check Balance
1
Please enter the amount you want to withdraw: 500
The available balance is: 500
Do you want to perform more operations?
Press 1 for yes, Press 2 for No
1
Please choose the operations you want to perform
1) Withdraw
2) Deposit
3) Check Balance
2
Please enter the amount you want to deposit: 500
The available balance is: 1000
Do you want to perform more operations?
Press 1 for yes, Press 2 for No
2
  2. Write a program to print numbers from 10 to 1 using a do-while loop
Output
10
9
8
7
6
5
4
3
2
1*/

import java.util.Scanner;

public class DoWhileHW {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("======HW1========");
        String choice;
        do {
            System.out.println("Welcome to ATM Machine!");
            System.out.print("Please enter your account opening balance: ");
            int balance = input.nextInt();
            System.out.println("Please choose the operations you want to perform\n1) Withdraw\n" +
                    "2) Deposit\n" +
                    "3) Check Balance");
            int oper = input.nextInt();
            if (oper == 1) {
                System.out.print("Please enter the amount you want to withdraw: ");
                int withdraw = input.nextInt();
                System.out.println("The available balance is: " + (balance - withdraw));
            } else if (oper == 2) {
                System.out.print("Please enter the amount you want to deposit: ");
                int deposit = input.nextInt();
                System.out.println("The available balance is: " + (balance + deposit));
            } else if (oper == 3) {
                System.out.println("The available balance is: " + balance);
            } else System.out.println("Wrong input");
            System.out.println("Do you want to perform more operations? (Yes/No)");
            choice = input.next();


        } while (choice.equalsIgnoreCase("yes"));

        System.out.println("=========HW2=========");
        int a = 10;
        do {
            System.out.println(a);
            a--;
        } while (a > 0);


    }
}
