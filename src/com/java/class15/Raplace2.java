package com.java.class15;

public class Raplace2 {

    public static void main(String[] args) {
        String str = "Devx Adventures World";
        int indexOfSpace = str.indexOf(" ");
        String str1 = str.substring(indexOfSpace).replaceFirst("e", "X");
        String str2 = str.substring(0, indexOfSpace);
        String finalResult = str2.concat(str1);
        System.out.println(finalResult);


    }
}
