package com.java.SelfPractice;

import java.util.Scanner;

/*ex.4. Write a Java program to get a number from the user and print whether it is positive or negative.
(Please also consider other nuances)

Example: input number 43, output: positive

ex.5. A company insures its drivers in the following cases:

- If the driver is married
- If the driver is unmarried, male & above 30 years of age
- If the driver is unmarried, female & above 25 years of age

**Example:
enter age: 54
enter gen: male
status: unmarried
output: Driver should  be Insured */
public class Task45 {
    public static void main(String[] args) {
        System.out.println("Task 4 ==================");
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the number: ");
        int num = input.nextInt();

        if(num>0){
            System.out.println(num+" is positive");
        } else if (num<0){
            System.out.println(num+" is negative");
        } else if (num==0){
            System.out.println(num+" is zero");
        } else {
            System.out.println("Wrong input");
        }
        System.out.println("Task 5==================");
        System.out.print("Please enter your age: ");
        int age = input.nextInt();
        input.nextLine();
        System.out.println("Please enter your gender: ");
        String gen = input.nextLine();
        System.out.println("Please enter your marital status: ");
        String status= input.nextLine();

        if(status.equalsIgnoreCase("married")) System.out.println("Driver should  be Insured");
        else if(status.equalsIgnoreCase("single")|| status.equalsIgnoreCase("unmarried")){
            if(age>=30&&gen.equalsIgnoreCase("male")) System.out.println("Driver should  be Insured");
            else if (gen.equalsIgnoreCase("female")||age>=25) System.out.println("Driver should  be Insured");
        }
        else System.out.println("Driver should not be Insured");


    }
}
