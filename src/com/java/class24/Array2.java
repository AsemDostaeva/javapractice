package com.java.class24;

public class Array2 {

    public static void main(String[] args) {
        int [] data = {43, 56 , 2 , 6, 78 ,32};
        int min = data[0];

        for (int datum : data) {
            if (min > datum ){
                min = datum;
            }

        }
        System.out.println(min);


    }
}
