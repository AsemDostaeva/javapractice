package com.java.class06;

public class ConditionalOR {
    public static void main(String[] args) {
        // Conditional OR is used for setting multiple conditions
        // and overall result is true only if one of them is true

        int age = 61;

        boolean giveDiscount = age> 60 || age<8;
        //System.out.println(giveDiscount);


        int currentTime = 9;
        boolean drinkCoffee = false;

        boolean drink = currentTime < 11 && currentTime> 6;
        //System.out.println(drink);


        byte completedEx = 3;
        byte video= 2;

        boolean canIrelax = completedEx >=5 || video>=2;
        //System.out.println(canIrelax);




        int loginAttepts = 2;
        double transaction = 500.1;
        String location = "USA";

        boolean block = loginAttepts>3 || transaction>3000.0 || location != "KG";
        System.out.println(block);






    }
}
