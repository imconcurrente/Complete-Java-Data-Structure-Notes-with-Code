package com.java;

//import java.util.Scanner;
//
//public class FizzBuzz {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Number: ");
//        int number = scanner.nextInt();
//
//        if (number % 5 == 0 && number % 3 == 0)
//            System.out.println("FizzBuzz");
//
//        else if (number % 5 == 0)    //---> % is modulus operator which returns the remainder of a divison
//            // 5 == 0 that means no. is divisible by 5
//            System.out.println("Fizz");
//
//        else if (number % 3 == 0)
//            System.out.println("Buzz");
//
//        else
//            System.out.println("number");
//
//    // This above code is more readable and clean
//    }
//}


 // But some of u will come complain abt the repetition of value
//For this i write the code but it will look more confusion
//Let me show u

import java.util.Scanner;

public class FizzBuzz{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Number: ");
        int number = scanner.nextInt();

        if (number % 5 == 0){
            if (number % 3 == 0)
                System.out.println("FizzBuzz");
            else
                System.out.println("Fizz");
        }
        else if (number % 3 == 0)
            System.out.println("Buzz");
        else
            System.out.println("number");
    }
}
