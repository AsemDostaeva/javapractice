package com.java.class08;
import java.util.Scanner;
public class IfElse {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Person 1:");
        int a = input.nextInt();
        System.out.print("Person 2:");
        int b = input.nextInt();
        if(a>b){
            System.out.println("Output: "+a);
        } else {
            System.out.println("Output: " + b);
        }
    }
}
