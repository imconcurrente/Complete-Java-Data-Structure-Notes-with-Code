package com.vedant;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        //Q: Take input of 2 numbers and print the sum
        int num1, num2, sum;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number 1: ");
         num1 = scanner.nextInt();
        System.out.print("Enter the number 2: ");
         num2 = scanner.nextInt();
         sum =num1+num2;
        System.out.print("The sum : " + sum);



    }
}