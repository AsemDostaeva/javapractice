package com.java.java;

import java.util.Scanner;

public class youtube {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter side x:");
        double x = input.nextDouble();
        System.out.print("Enter side y:");
        double y = input.nextDouble();

        double z = Math.sqrt((x*x)+(y*y));
        System.out.println(z);

        input.close();




            }
        }

