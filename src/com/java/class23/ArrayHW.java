package com.java.class23;

import java.util.Scanner;

public class ArrayHW {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("=======1=======");
        int [] intArray = {1, 2, 3, 4, 5};
        for ( int i = intArray.length-1; i >= 0; i--){
            System.out.print(intArray[i]+" ");
        }
        System.out.println();


        System.out.println("=======3=======");
        int [] myIntArr = {45, 65, 85, 24, 45, 85, 34, 65, 45, 85};
        for (int i = 0; i <= myIntArr.length; i++){
            if (i % 2 == 1){
                System.out.println(myIntArr[i]);
            }
        }

        System.out.println("=======4=======");
        int [] myArr = {5, 2, 8, 7, 1};
        for (int i = 0; i < myArr.length; i++){
            for (int j = i + 1; j < myArr.length; j++){
                if (myArr[i] > myArr[j]){
                    int a = 0;
                    a = myArr[i];
                    myArr[i] = myArr[j];
                    myArr[j] = a;
                }
            }
            System.out.print(myArr[i] +" ");
        }


    }
}
