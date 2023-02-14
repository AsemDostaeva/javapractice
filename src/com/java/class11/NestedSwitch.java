package com.java.class11;

public class NestedSwitch {
    //Online store.
// we want to write a program which calculates shipping cost based on
//destination and based on total spending
//if the customer is spending less than $5 than charge $5 for shipping
//if spending more than 5 and less or equal to $10 then charge $10


//if spending more than 10 then.
//we also look at the shipping destination.
//if it's usa -> we should charge 10% of the total spending for shipping
//if it's canada -> charge 15% of total spending
//if it's Europe -> charge 20% of total spending
//if it's any other place -> charge 25% of total spending

    public static void main(String[] args) {
        String destination = "USA";
        double totalSpending = 720;

        if (totalSpending<0){
            System.out.println("Wrong input");
        }
        switch ((int)totalSpending){
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("Shipping cost is 5$");
                break;
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                System.out.println("Shipping coost is 10&");
            default:
                switch (destination){
                    case "USA":
                        System.out.println("Shipping cost is $"+totalSpending*0.1);
                        break;

                    case "Canada":
                        System.out.println("Shipping cost is $"+totalSpending*0.15);
                        break;

                    case "Europe":
                        System.out.println("Shipping cost is $"+totalSpending*0.2);
                        break;

                    default:
                        System.out.println("Shipping cost is $"+totalSpending*0.25);
                }



        }
    }
}
