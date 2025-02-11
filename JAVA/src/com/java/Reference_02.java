package com.java;
import java.awt.*;

public class Reference_02 {
    public static void main(String[] args) {
        Point point1 = new Point(1, 1);
        Point point2 = point1;
        point1.x = 2;
        System.out.println(point2);
        //so remember this reference types are copied by the references
        //whereas primitive types are copied by their value
        //and these values are completely independent of each other
    }
}
