package com.java;
public class Pattern5 {
    public static void main(String[] args) {
pattern5(5);
    }
    static void pattern5(int n) {
        for (int row = 1; row <= 2 * n; row++) {
            int totalColsInRow = row > n ? 2 * n - row : row;
            for (int col = 1; col <= totalColsInRow; col++) {
                System.out.print("* ");
            }
            // when one row is printed, we need to add a newline
            System.out.println();
        }
    }
}
