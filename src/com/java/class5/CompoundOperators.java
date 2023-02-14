package com.java.class5;

public class CompoundOperators {
    public static void main(String[] args) {
        int i = 10;
        System.out.println(i++);
        System.out.println(++i);

        System.out.println("=============");

        int var1 = 20;
        System.out.println(var1++);
        System.out.println(++var1);

        int var2 = var1++;
        int var3 = ++var1;

        System.out.println(var1);
        System.out.println(var2);
        System.out.println(var3);

    }
}
