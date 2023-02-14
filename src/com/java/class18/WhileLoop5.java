package com.java.class18;

public class WhileLoop5 {

    public static void main(String[] args) {
        int a = 1;
        while (a <= 50){
            if (a % 5 == 0 || a % 3 ==0){
                System.out.println(a);
            }
            a++;
        }
    }
}
