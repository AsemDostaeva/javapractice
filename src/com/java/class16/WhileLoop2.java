package com.java.class16;

public class WhileLoop2 {

    public static void main(String[] args) {
        String a = "*";

        while (a.length() < 6) {
            System.out.println(a);
            a = a.concat("*");

        }

        String b = "*";
        int iter = 0;

        while (iter < 9) {
            System.out.println(b);
            b = b.concat("*");
            iter++;
        }

        int c = 10;

        while (c >= 0) {
            System.out.println(c);
            c--;
        }

        String str = "*****";
        int length = str.length();

        while (length >= 0) {
            str = str.substring(0, length--);
            System.out.println(str);
        }

        int num2 = 0;
        while (num2 < 20) {
            System.out.println(num2 += 2);

        }

        String str3 = "Hello! My name is Asem";
        int letter = 0;
        int vowel = 0;
        int consonant = 0;

        while (letter < str3.length()){
          switch (str3.charAt(letter)){
              case 'a':
              case 'A':
              case 'e':
              case 'E':
              case 'i':
              case 'I':
              case 'u':
              case 'U':
              case 'o':
              case 'O':
                  ++vowel;
                  break;
              default:
                  ++consonant;
          }
          letter++;

        }
        System.out.println(vowel+ "vowels");
        System.out.println(consonant+ "consonant");





    }
}
