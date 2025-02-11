package com.java;

import java.util.Arrays;
import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Way 1
        //array of primitives
        int [] arr = new int[5];
        arr[0] = 23;
        arr[1] = 67;
        arr[2] = 55;
        arr[3] = 39;
        arr[4] = 48;
        // [23, 67, 55, 39, 48]
        System.out.println(arr[3]);


        //Way 2
        // input using for loops
//        for (int i = 0; i <arr.length ; i++) {
//            arr[i] = scanner.nextInt();
//        }
//        // To-String method
//        System.out.println(Arrays.toString(arr));

//        for (int i = 0; i <arr.length ; i++) {
//            System.out.print(arr[i] + " ");
//        }


        //Way 3
        // for-each loop:
//        for (int num : arr) { // for every in array, print the element
//            System.out.print(num + " "); // here num represents  element of the array
//        }
//        System.out.println(arr[5]); // index out of bound error!

        //array of objects/Reference

        String[] str = new String[4];
        for (int i = 0; i < str.length ; i++) {
            str[i] = scanner.next();
        }
        System.out.println(Arrays.toString(str));

        //modify
        str[1] = "Vedant";
        System.out.println(Arrays.toString(str));
    }
}
