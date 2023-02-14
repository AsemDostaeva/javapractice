package com.java.class17;
//Write a program that calculates the sum of all even numbers between 1 and a 100 using a while loop.
//2+4+6+8 … = ?
//2. Write a program that prints all prime numbers between 1 and a 100  using a while loop.
public class WhileLoopHW {

    public static void main(String[] args) {
        System.out.println("======HW1========");
        int num = 0, sum=0;
        while (num <= 100){
            if (num % 2 == 0){
                sum += num;
            }
            num++;
        }
        System.out.println(sum);
        System.out.println("=======HW2=======");
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
