package com.java.class14;

public class IndexOf {

    public static void main(String[] args) {
        String str = "Tik Tak";
        System.out.println(str.indexOf("Tak"));

        String str2 = "blah blah blah";
        System.out.println(str2.indexOf("hello"));//-1

        String str3 = "Hello World";
        System.out.println(str3.indexOf("l" , 7));

        String str4 = "Lala polluza lala land la lackers";
        System.out.println(str4.indexOf("la", 14));

    }
}
