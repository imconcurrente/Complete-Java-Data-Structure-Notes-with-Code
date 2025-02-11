package com.java;

public class PowOfTwo {
    public static void main(String[] args) {
        int n = 32; // note : fix for n = 0
        boolean ans = (n & (n - 1)) == 0;
        System.out.println(ans);
    }
}
