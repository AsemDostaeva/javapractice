package com.java.class17;

public class WhileLoop3 {
    public static void main(String[] args) {

        String str = "aoaoaoaoaoaoaoaoaoaoao";
        int index = 1;

        while (index < str.length()){

            System.out.println(str.charAt(index));
            index+=2;

        }


        System.out.println("==================");
        String str1 = "Hello World!";
        int let = 0;

        while (let < str1.length()-1){
            let++;
            if (let % 2 != 0 ){
                char eachChar = str1.charAt(let);
                System.out.println(eachChar);
            }
        }


    }
}
