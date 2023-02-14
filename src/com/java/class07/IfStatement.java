package com.java.class07;
import java.util.Scanner;

public class IfStatement {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("What the weather like?");
        int fahrenheit = input.nextInt();
        if (fahrenheit<32){
            System.out.println("Stay at home");
        }
        if ( fahrenheit>=32 && fahrenheit <41){
            System.out.println("It's little chilly outside");

        }
        if (fahrenheit>=42 && fahrenheit<68){
            System.out.println("It's a good weather outside. Go get some fresh air ");
        }
        if (fahrenheit>=68){
            System.out.println("it's amazing outside. Let's go to pool and get vitamin D");
        }
    }
}
