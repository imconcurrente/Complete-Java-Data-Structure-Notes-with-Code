package com.java;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListsExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Syntax
        ArrayList<Integer> list = new ArrayList(5); // initial capacity does not matter 5 se bhi jayda print kra shakte ho!

//        list.add(23);
//        list.add(45);
//        list.add(89);
//        list.add(67);
//        list.add(156);
//
//        System.out.println(list.contains(67));
//
//        System.out.println(list.set(0,99));
//
//        list.remove(2);
//
//        System.out.println(list);
//
        //input
        for (int i = 0; i < 5; i++) {
            list.add(scanner.nextInt());
        }
        // get item at any index
        for (int i = 0; i < 5; i++) {
            System.out.println(list.get(i)); // here u will pass index, list[index] syntax will not work here
        }
        System.out.println(list);
    }
}
