package com.java.class16;

public class WhileLoopHW {

    public static void main(String[] args) {
        System.out.println("HW 1");
        int a = 1;
        while (a <= 20){
            System.out.println(a);
            a+=2;
        }
        System.out.println("=========HW2=========");
        int num = 0;
        int sum = 0;
        while (num < 10){
            num++;
            sum = sum + num;
        }
        System.out.println(sum);
        System.out.println("=======HW3==========");
        int b = 3;
        int c = 0;
        int sum1 = 0;
        while (c < 10){
            c++;
            sum1 = b * c;
            System.out.println(b + "*"+ c + "=" + sum1);
        }

    }
}
//Write a program that uses a while loop to print the multiplication table for a given number.