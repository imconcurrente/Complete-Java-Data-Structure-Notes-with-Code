package com.java.properties.polymorphism;

public class Shapes {
    void area() {
        // If you use final key --> final void area() it will give an error and do not overide the methods
        System.out.println("I am in shapes");
    }

//    // Early binding: check my notes
//    final void area() {
//        System.out.println("I am in shapes");
//    }
}
