package com.java;

//public class While_Loops_19 {
//    public static void main(String[] args) {
//        for (int i = 5; i > 0; i--)
//            System.out.println("Hello World " + i);
//
//
//        int i = 0;
//        while (i > 0) {
//            System.out.println("Hello World " + i);
//            i--;
//        }
//    }
//}

//While Loops are generally being used where we don't know
//that how many times we wanna repeat something

//let me show u

import java.util.Scanner;
public class While_Loops_19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = "";
        //while (input != "quit")   ---> aisa likhna tha par input reference
               // type h toh string aur input dono ke address different honge therefore
              //  we can use this
        while (!input.equals("quit")) {
            System.out.print("Input: ");
            input = scanner.next().toLowerCase();
            System.out.println(input);
        }
    }
}