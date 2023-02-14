package com.java.class17;

public class WhilePractice2 {

    public static void main(String[] args) {
        String str = "Let's go Mars";
        int index = 0;

        while(index < str.length()){
            System.out.println(str.charAt(index));
            index ++;
        }

        String str1 = "I love Java!";
        int startIndex = str1.length()-1;

        while (startIndex >= 0){
            System.out.print(str1.charAt(startIndex));
            startIndex--;
        }
    }
}
