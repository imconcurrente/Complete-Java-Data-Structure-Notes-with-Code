package com.vedant;

import java.util.Scanner;

public class ThreeDigitsArmstrongNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//         int n = scanner.nextInt();
//         System.out.println(isArmstrong(n));


        for (int i = 100; i < 1000; i++) {
          if (isArmstrong(i)) {
              System.out.print(i + " ");
          }
        }
    }
    //Print all the 3 digits armstrong numbers
    static  boolean isArmstrong(int n){
        int original = n;
        int sum = 0;
        while (n > 0){
            int rem = n % 10;
            n = n / 10;
            sum = sum + rem*rem*rem;
        }
       return sum == original;
    }
}
