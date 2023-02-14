package com.java.class21;

import java.util.Scanner;

public class LoopHW {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("===1===");
        String str = input.nextLine();
        str = str.toLowerCase();
        int j = 0;
        for (int i = 0; i < str.length(); i++) {
            char v = str.charAt(i);
            if (v == 'a' || v == 'e' || v == 'u' || v == 'o' || v == 'i') {
                j++;
            }
        }
        System.out.println(j);
        System.out.println("===2===");

        String str2 = input.nextLine();
        for (int q = str2.length() - 1; q >= 0; q--) {
            System.out.print(str2.charAt(q));
        }
        input.nextLine();

        System.out.println("===3===");
        int num = input.nextInt();
        int originalNum = num;
        int reverseNum = 0;
        while (num != 0) {
            int lastDigit = num % 10;
            reverseNum = reverseNum * 10 + lastDigit;
            num /= 10;
        }

        if (originalNum == reverseNum) {
            System.out.println(originalNum + " is a palindrome.");
        } else {
            System.out.println(originalNum + " is not a palindrome.");
        }

        System.out.println("===4===");
        for (int r = 1; r <= 5; r++){
            for (int t = 1; t <= r; t++){
                System.out.print("*");
            }
            System.out.println();
        }

        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int h = n; h > i; h--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            for (int l = i - 1; l >= 1; l--) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = n; i >= 1; i--) {
            for (int g = n - i; g >= 1; g--) {
                System.out.print(" ");
            }
            for (int d = 1; d <= i; d++) {
                System.out.print("*");
            }
            System.out.println();



        }

        int num2 = input.nextInt();


        for(int c = 1; c <= num2; c++){
            for (int sp = num2-c; sp >=1; sp--){
                System.out.print(" ");
            }
            for (int g = 1; g <= c * 2 - 1; g++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

