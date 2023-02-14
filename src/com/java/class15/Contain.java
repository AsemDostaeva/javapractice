package com.java.class15;

public class Contain {

    public static void main(String[] args) {
        String str = "Hello, Askar! In thank you for interviewing for Apple."+
        "We want to congratulate you on receiving an offer";
//contains method return boolean (true/false)
//returns true if the given String param exists /in the String.
        boolean doesContain = str. contains ("offer") ;
        System.out.println (doesContain);
    }
}
