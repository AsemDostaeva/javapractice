package com.java.SelfPractice;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        /*a program that contains 3 inputs (correct answer \ give up \ wrong answer) if the answer is not correct,
        you must tell the person to try again \ if he writes give up, tell him the correct answer or say well done
        this is the correct answer. (you must use the switch)
for example:
a = "love"
input: give up
output:  Answer is love

input: gd;
output: Wrong answer try again*/
        System.out.println("What is the capital of China?\n If you don't know type \" Give up \" ");
        Scanner input = new Scanner(System.in);
        String ans= input.nextLine();

        switch(ans){
            case "Beijing":
            case "beijing":
                System.out.println("This is correct answer! Great job"); break;
            case "Give up":
            case "give up":
                System.out.println("Well done. The correct answer is Beijing"); break;
            default:
                System.out.println("Wrong answer, try again!");
        }
    }
}
