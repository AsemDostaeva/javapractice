package com.java.class22;

import java.util.Scanner;

public class ArrayHW {

    public static void main(String[] args) {
        System.out.println("=======1=======");
        int [] intArray = new int[7];
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter 7 numbers:  ");
        for (int i = 0; i < intArray.length; i++){
            intArray[i] = input.nextInt();
        }
        int greatest = intArray[0];
        for (int j = 0; j < intArray.length; j++){
            if (intArray[j] > greatest){
                greatest = intArray[j];
            }
        }
        System.out.println("The greatest number is: "+greatest);
        System.out.println("=======2=======");
        int [] oddAndEven = new int [7];
        System.out.println("Please enter 7 numbers:  ");
        for (int q = 0; q < oddAndEven.length; q++){
            oddAndEven[q] = input.nextInt();
        }
        int sumEven = 0;
        int sumOdd = 0;
        for (int w = 0; w < oddAndEven.length; w++ ){
            if (oddAndEven[w] % 2 == 0){
                sumEven += oddAndEven[w];
            } else {
                sumOdd += oddAndEven[w];
            }
        }
        System.out.println("Sum of Even numbers: "+sumEven);
        System.out.println("Sum of odd numbers: "+sumOdd);
        System.out.println("=======3========");
        int array2 [] = {12, -45, 67, 23, -13, 45, -56};
        int pos = 0;
        int neg = 0;
        for (int e = 0; e < array2.length; e++){
            if (array2[e] >= 0){
                pos++;
            } else {
                neg++;
            }
        }
        System.out.println("Positibe mumbers: "+pos+"\nNegative numbers: "+neg);
    }
}
