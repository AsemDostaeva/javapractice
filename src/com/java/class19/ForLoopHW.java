package com.java.class19;

import java.util.Scanner;

public class ForLoopHW {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("=======HW1=======");
        int sum = 0, i;
        for (i = 1; i <= 10; i++){
            if (i % 2 == 0){
                sum = sum + i;
            }
        }
        System.out.println(sum+ " is sum of all even numbers");
        System.out.println("=======HW2=======");
        int j, num = input.nextInt(), div = 0;
        for (j = 1; j <= num; j++){
            if (num % j == 0){
                div++;
            }
        }
        System.out.println("Number "+num+" has "+div+" divisors");

        System.out.println("=======HW3=======");
        for (int num1 = 1; num1 <= 100; num1++){
            if (num1 % 5 == 4 && num1 % 4 == 3 && num1 % 3 == 2 && num1 % 2 == 1){
                System.out.println(num1+ " is a magic number");
            }
        }
        System.out.println("=======HW4=======");
        int sum1 = 0;
        for (int a = 1; a <= 10; a++){
            if (a % 3 == 0){
                sum1 -= a;
            } else {
                sum1 += a;
            }
        }
        System.out.println(sum1 + " is sum of 1 + 2 - 3 + 4 + 5 - 6 + 7 + 8 - 9 + 10");
        System.out.println("=======HW5=======");
        int sum2 = 0;
        for (int b = 1, c = 10 ; b <= 5; b++, c-- ){
            sum2 += b + c;
        }
        System.out.println(sum2);

        System.out.println("=======HW6=======");
        int sum3 = 0;
        for (int f = 1; f <= 5; f++){
            sum3 += f*f;
        }
        System.out.println(sum3);


    }
}
