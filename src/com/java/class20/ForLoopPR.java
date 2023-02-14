package com.java.class20;

import java.util.Scanner;

public class ForLoopPR {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        System.out.print("Enter a number: ");
//        int a = input.nextInt();
//        int count = 0;
//
//        while (a > 0){
//            a /= 10;
//            count ++;
//        }
//        System.out.println(count);


        int i = input.nextInt();
        int j = 0;
        while (i > 0){
            j = i % 10;
            System.out.print(j);
            i = i / 10;
        }

    }
}
