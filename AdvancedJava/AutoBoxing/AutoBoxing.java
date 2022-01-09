package com.AdvancedJava.AutoBoxing;

// Ability to change from a primative data type to a wrapper class

public class AutoBoxing {
    public static void main(String[] args) {
        //Autobox
        int i = 7;
        Integer intObj = Integer.valueOf(i);
        System.out.println("Value of int object: " + intObj);

        //Unboxing
        int m = intObj;
        System.out.println("Value int: " + m);
    }
}
