package com.java.properties.polymorphism;

public class Circle extends Shapes {

    // this will run when obj of Circle is created
    // hence it is overriding the parent method

    // if u want to check if the method is overriding just write @Override
    @Override // this is called annotation
    void area() {
        System.out.println("Area is pie * r * r");
    }
}
