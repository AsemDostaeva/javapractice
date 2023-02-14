package com.java.SelfPractice;

public class PrimeNumbers {

    public static void main(String[] args) {
        //prime numbers can be divisible by 1 and itself
        //11/1 and 11/11

        int i=2, j=1, counter = 1;
        while (i<=100){
         j++;
         if (i % j != 0) {
             i++;
         }

         if (counter == 2){
             System.out.println(i);
             counter++;
         }
            System.out.println(i);
        }
    }
}
