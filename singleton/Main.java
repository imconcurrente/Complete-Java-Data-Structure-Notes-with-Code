package com.java.singleton;

public class Main {
    public static void main(String[] args) {
//        Singleton obj = new Singleton(); // cannot use singleton because it is private

        Singleton obj1 = Singleton.getInstance();

        Singleton obj2 = Singleton.getInstance();

        Singleton obj3 = Singleton.getInstance();

        // All 3 reference variable are pointing to just one object
    }
}
