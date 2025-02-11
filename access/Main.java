package com.java.access;

import javax.swing.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        A obj = new A(10, "Kunal");
        // need to do a few things
        // 1. access the data members
        // 2. modify the data members

//        ArrayList<Integer> list = new ArrayList<>(23);
//        list.DEFAULT_CAPACITY; // Can't access because it is privat
        obj.getNum();
    }
}
