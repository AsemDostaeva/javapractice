package com.java.class12;
import java.util.Scanner;
/* 2.    Create a method that takes a char representing a grade (A, B, C, D, or F) and returns a boolean
         indicating whether the grade is passing or failing. A and B are passing, C,D,F are failing.*/
public class MethodsIntroHW2 {

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("What grade did you get?");
        char grade = input.next().charAt(0);
        System.out.println("Let's see you passed or not\nTrue is passed, false is failed.");

        System.out.println(passOrFail(grade));

    }
    public static boolean passOrFail (char grade){
        if (grade == 'A' || grade == 'B'){
            return true;
        }  else {
            return false;
        }
    }
}
