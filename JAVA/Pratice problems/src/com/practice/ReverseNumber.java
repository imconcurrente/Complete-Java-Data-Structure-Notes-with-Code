package com.practice;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");

        int num = scanner.nextInt();
        int rev=0;

        //Logic-1 for loops
//        for (; num!=0; num = num / 10){
//           int rem = num % 10;
//            rev = rev * 10 + rem;
//        }

        //Logic-2 while loops
        while(num != 0)
        {
            rev = rev*10 + num%10;
            num = num/10;
        }
           System.out.println(rev);


    }
}