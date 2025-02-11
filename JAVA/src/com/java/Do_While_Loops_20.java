package com.java;

import java.util.Scanner;

public class Do_While_Loops_20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = "";
        while (!input.equals("quit")) {
            System.out.print("Input: ");
            input = scanner.next().toLowerCase();
            System.out.println(input);
        }

        do {
            System.out.print("Input: ");
            input = scanner.next().toLowerCase();
            System.out.println(input);
        }while (!input.equals("quit"));
    }
}
//Now compared these two types of loops with
//while loops we check the condition first so
//if the condition is false the first time this
//loop will never get executed in contrast with
//
//Do-While loops we check the condition at last so
//do while loops always get executed at least once
//even if the condition is false




//kuch nhi try kr rha tha code ko do while condition ka code aisa hoga
//public class Do_While_Loops_20{
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        String input = "";
//        do {
//            System.out.print("Input: ");
//            input = scanner.next().toLowerCase();
//            System.out.println(input);
//        } while (!input.equals("quit"));
//    }
//}

