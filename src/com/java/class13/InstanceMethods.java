package com.java.class13;

public class InstanceMethods {

    public static void main(String[] args) {
        print();
        InstanceMethods someVarName= new InstanceMethods();
        someVarName.print1();


    }
    public static void print (){
        System.out.println("hello");
    }
    public void print1 (){
        System.out.println("Hello");
    }
}
