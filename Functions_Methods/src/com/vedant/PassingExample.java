package com.vedant;

import static com.vedant.StringExample.greet;

public class PassingExample {
    public static void main(String[] args) {
        String name = "Vedant Dixit";
        greet(name);
    }
    static void greet(String naam){
        System.out.println(naam);
    }
}
