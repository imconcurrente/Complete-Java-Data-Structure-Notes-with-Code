package com.java;
//https://leetcode.com/problems/find-numbers-with-even-number-of-digits/
public class EvenDigits {
    public static void main(String[] args) {
        int[] nums = {12, 345, 2, 6, 7896};
        System.out.println(findNumbers(nums));
        System.out.println(digits2(-456798));
    }

    static int findNumbers(int[] nums) {
        int count = 0;
        for (int num : nums) {
            if (even(num)) {
                count++;
            }
        }
        return count;
    }

    // function to check whether a number contains even digits or not
    static boolean even(int num) {

        int numberOfDigits = digits(num);
        /*
          if (numberOfDigits % 2 == 0){
            return true;
        }
        return false;
        */

        // This is shortcut
        return numberOfDigits % 2 == 0;
    }

    // Optimized solution this will be explained in Number System later
    // method -2:
    static  int digits2(int num){
        if (num < 0){
            num = num * -1;
        }
         return (int)(Math.log10(num)) + 1;
    }


    //count number of digits in a number
    static int digits(int num){
        if (num < 0){
            num = num * -1;
        }
        if (num == 0){
            return  1;
        }
        int count = 0;
        while(num > 0){
            count++;
            num = num / 10; // num = num /= 10
        }

        return count;
    }
}