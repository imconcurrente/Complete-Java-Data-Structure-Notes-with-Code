package com.java;

import java.util.Scanner;

//public class Reading_Input_12 {
//    //How to read input from the user
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Age: ");
//// println is renamed to print becoz of we're getting new line
//        byte age = scanner.nextByte();
//        System.out.println("You are " + age);
//    }
//}
//What if we use string
public class Reading_Input_12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Name: ");
        String name = scanner.nextLine().trim();   //---> it is a chaining of multiple methods
        // -->nextline() is been used rather next() to get my full name
//        now we have the problem of getting spaces in result if we make spaces
//                before name for that we use
//                scanner.nextline().trim(); check the result after run!
        System.out.println("You are " + name);
    }
}

