package com.java.class12;
/*We have a loud talking parrot. Create a function that will tell us if we are
in trouble or not based on the hour and based on if the parrot is talking.

The "hour" is the current hour time in the range 1..24.
We are in trouble if the parrot is talking and the hour is before 7 or after 20.
Return true if we are in trouble.*/

public class MethodsIntro2 {
    public static void main(String[] args) {
        System.out.println(inTrouble(20, false));

    }

    public static boolean inTrouble(int time, boolean parrot) {
      if (parrot){
          if (time <= 7 || (time >= 20 && time <=24 )){
              return true;
          } else {
              return false;
          }
      } else {
          return false;
      }

    }
}

