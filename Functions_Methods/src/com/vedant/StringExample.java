package com.vedant;

import java.util.Scanner;

public class StringExample {
    public static void main(String[] args) {
//        String message =greet();
//        System.out.println(message);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String naam = scanner.next();
        String personalised = myGreet(naam);
        System.out.println(personalised);
    }

    private static String myGreet(String name) {
        String message = "Hello " + name;
        return message;
    }



    static String greet(){
        String greeting = "How are u";
        return greeting;
    }

}
