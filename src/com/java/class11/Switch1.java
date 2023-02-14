package com.java.class11;

public class Switch1 {

    public static void main(String[] args) {
//        int rate = 2;
//        switch (rate){
//            case 1:
//                System.out.println("Awful service");
//            case 2:
//                System.out.println("Extremely poor service");
//            case 3:
//                System.out.println("Bad service");
//
//
//        }
//
//        String shipmentState = "Florida";
//        switch (shipmentState){
//            case "Alaska":
//            case "Hawaii":
//                System.out.println("Shipment cost is $10");
//                break;
//            case "NY":
//                System.out.println("Shipment cost is $5");
//                break;
//            case "Florida":
//                System.out.println("Shipment cost is $7");
//                break;
//            case "California":
//                System.out.println("Shipment cost is $12");
//                break;
//        }


        int month = 4;
        switch(month){
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("30 days");
                break;
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("31 days");
                break;
            case 2:
                System.out.println("28/29 days");
                break;
            default:
                System.out.println("Wrong input");
        }
    }
}
