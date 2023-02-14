package com.java.class17;
//write a program to Print
// 1 10 2 9 3 8 4 7 5 6
public class WhileLoopPractice {

    public static void main(String[] args) {
        int a = 1;
        int b = 10;
         while (a <= 5 && b >= 6){
             System.out.println(a);
             System.out.println(b);
             a ++;
             b --;
         }
    }
}
