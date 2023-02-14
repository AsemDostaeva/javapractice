package com.java.class15;

public class Trim {

    public static void main(String[] args) {
        String name = "Elop ";
        boolean name1 = name.trim().equals("Elon");
        System.out.println(name1);

        String str = "       ";
        System.out.println(str.isEmpty());

        String str1 = "       ";
        System.out.println(str1.isBlank());

        String str2 = "Hey DevX student";
        System.out.println(str2.contains("DevX"));

        String str3 = "Hello World";
        System.out.println(str3.endsWith("d"));


    }
}
