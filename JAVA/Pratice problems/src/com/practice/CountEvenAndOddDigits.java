package com.practice;

public class CountEvenAndOddDigits {
    public static void main(String[] args) {
        int num = 246813;

        int even_num = 0;
        int odd_num = 0;

        while (num > 0) {
            int rem = num % 10;

            if (rem % 2 == 0) {
                even_num++;
            } else {
                odd_num++;

            }
            num = num / 10;
        }
        System.out.println("Number of Even number: " + even_num);
        System.out.println("Number of Odd number: " + odd_num);


        for (int i = 0; num > 0; i++) {
            int rem = num % 10;

            if (rem % 2 == 0) {
                even_num++;
            } else {
                odd_num++;
            }
            num = num/10;
        }
        System.out.println("Number of Even number: " + even_num);
        System.out.println("Number of Odd number: " + odd_num);
    }
}