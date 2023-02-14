package com.java.class20;
/*1. Write a program to find sum of 1^1 + 2^2 + 3^3 + 4^4 + 5^5
  2. Write a program to find sum of 1/2 + 2/3 + 3/4 + 4/5 +......10/11
Note - Please print the sum in decimal, answer should not be zero
  3. Write a program to print the sum of each digit from the given number
Example1
Input - 3521
Output - 11
Example2
Input - 5390
Output - 17
  4.  Write a program to print the greatest digit from the given number
Example1
Input - 86545
Output - Greatest digit is 8
Example2
Input - 23561
Output - Greatest digit is 6
  5.  Write a program to print the reverse of the given number
Example1
Input - 86545
Output - 54568
Example2
Input - 23561
Output - 16532*/

import java.util.Scanner;

public class ForHW {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("=======1=======");
        int sum = 0;
        for (double a = 1; a <= 5; a++){
            sum += Math.pow(a , a);
        }System.out.println(sum);
        System.out.println("=======2=======");
        double s = 0;
        double i = 1;
        for (double j = 1; j <= 10; j++){
            i++;
            s += j/i;
        }System.out.println(s);
        System.out.println("=======3=======");
        int num = input.nextInt();
        int num1 = 0;
        while (num > 0){
            num1 += num%10;
            num /= 10;
        }System.out.println(num1);
        System.out.println("=======4=======");
        int b = input.nextInt();
        int great = 0;
        while (b > 0){
            if (b % 10 > great){
                great = b % 10;
            }
            b /= 10;
        }System.out.println(great);
        System.out.println("=======5=======");
        int f = input.nextInt();
        int g = 0;
        while (f > 0){
            g = f % 10;
            System.err.print(g);
            f /= 10;
        }


    }
}
