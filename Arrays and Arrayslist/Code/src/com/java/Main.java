package com.java;

public class Main {
    public static void main(String[] args) {
        // Arrays is the collections of datatypes it either be primitive or reference/object types.

        //Syntax:-
        //datatype[] variable_name = new datatype[size];


        //store 5 roll numbers:
//        int[] rollno1 = new int[5];
//        // or directly
//        int [] rollno2 = {23, 12, 56, 54, 15};


        int[] arr; // declaration of array.arr is getting defined in the stack
        arr = new int[5]; // initialisation: actually here object is being created in heap memory
        System.out.println(arr[0]);


        String[] name = new String[4];
        System.out.println(name[0]);

        //enchaned for loop
//        for (String element : name ){
//            System.out.println(name);
//        }
//

    }
}
