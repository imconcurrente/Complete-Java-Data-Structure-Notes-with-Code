package com.java.properties.polymorphism;

public class Main {
    public static void main(String[] args) {
        Shapes shape = new Shapes();
        Circle circle = new Circle();
//        Square square = new Square(); // neeche wala is also same for square and for all other  u can write Shapes
        Shapes square = new Square(); // ref variable is of parent class that to works!


        shape.area();
        circle.area();
        square.area();


    }
}
