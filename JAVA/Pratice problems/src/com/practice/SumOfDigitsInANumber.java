package com.practice;

public class SumOfDigitsInANumber {
    public static void main(String[] args) {
        int num = 256;
        int sum = 0;
        while (num>0){
           sum = sum+ num%10;
           num = num/10;
        }

        System.out.println("Sum of digits in a number: "+ sum);
    }
}
