package com.java.collections;

import java.util.List;
import java.util.Vector;
// vector is not that much faster than arraylist
public class VectorExample {
    public static void main(String[] args) {
        List<Integer> vector = new Vector<>();
        vector.add(45);
        vector.add(4);
        vector.add(77);
        vector.add(32);
        vector.add(13);

        System.out.println(vector);
    }
}
