package com.practice;

public class SwappingNumber {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        System.out.println("Before swapping values are: " + a + " " + b);
        // Logic1 - Third variable
        /*int t = a;
        a=b;
        b = t;*/


        //Logic2 - using + & -
      /*  a = a+b;
        b = a-b;
        a = a-b;*/

        //Logic3 - using * and /

        a = a * b;
        b = a / b;
        a = a / b;


        System.out.println("After swapping values are: " + a + " " + b);
    }
}