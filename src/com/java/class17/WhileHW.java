package com.java.class17;

public class WhileHW {

    public static void main(String[] args) {
        int d = 0, i = 1, j = 1;
        while (i < 100) {
            j = 1;
            d = 0;
            while (j <= i) {
                if (i % j == 0) d++;
                j++;
            }
            if (d == 2) {
                System.out.println(i);
            }
            i++;
        }

    }
}
