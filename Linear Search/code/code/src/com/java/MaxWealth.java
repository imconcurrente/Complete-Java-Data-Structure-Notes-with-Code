package com.java;

//https://leetcode.com/problems/richest-customer-wealth/
public class MaxWealth {
    public static void main(String[] args) {
        int[][] accounts = {
                {1, 2, 3},
                {4, 8 , 1}
        };
        int ans = maximumWealth(accounts);
        System.out.println(ans); // kuch galat ho rha h
    }

  static int maximumWealth(int[][] accounts){
        // person = row
        // accounts = col
        int ans = Integer.MIN_VALUE;
        for (int[] element : accounts) {
            // when you start a new col, take a new sum  for that row
            int sum = 0;
            for (int anInt : element) {
                sum += anInt;
            }
            // now we have sum of accounts of person
            // check with overall ans
            if (sum > ans) {
                ans = sum;
            }
        }
        return ans;
    }
}
