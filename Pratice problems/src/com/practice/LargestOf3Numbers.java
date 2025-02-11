package com.practice;

import java.util.Scanner;

public class LargestOf3Numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter First Number");
        int a = scanner.nextInt();

        System.out.println("Enter Second Number");
        int b = scanner.nextInt();

        System.out.println("Enter Third Number");
        int c = scanner.nextInt();
if (a>b & a>c)
       System.out.println(a+ " is largest number");
   if (b>a & b>c)
       System.out.println(b+ " is largest number");
   if (c>a & c>b)
       System.out.println(c+ " is Largest number");
}
    }

