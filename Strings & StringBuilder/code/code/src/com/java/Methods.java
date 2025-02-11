package com.java;

import java.util.Arrays;
//Try many more in name. methods
public class Methods {
    public static void main(String[] args) {
        String name = "Vedant Dixit";
        System.out.println(Arrays.toString(name.toCharArray()));
        System.out.println(name.toLowerCase());
        System.out.println(name);
        System.out.println(name.indexOf('a'));
        System.out.println("    Vedant ".strip());
        System.out.println(Arrays.toString(name.split(" ")));
    }
}
