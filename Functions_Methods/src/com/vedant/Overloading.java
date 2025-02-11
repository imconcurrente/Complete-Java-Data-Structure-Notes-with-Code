package com.vedant;

public class Overloading {
    public static void main(String[] args) {
            fun(87);
            fun("Vedant Dixit");
    }

    static void fun(int a){
        System.out.println(a);
    }

    static void fun(String name){
        System.out.println(name);
    }
}
