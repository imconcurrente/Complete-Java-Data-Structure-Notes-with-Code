package com.java;

public class Pattern28 {
    public static void main(String[] args) {
pattern28(5);
    }
    static void pattern28(int n) {
        for (int row = 1; row <= 2 * n; row++) {
            int totalColsInRow = row > n ? 2 * n - row : row;

            int noOfSpaces = n - totalColsInRow;
            for (int s = 0; s < noOfSpaces; s++) {
                System.out.print(" ");
            }

            for (int col = 1; col <= totalColsInRow; col++) {
                System.out.print("* ");
            }
            // when one row is printed, we need to add a newline
            System.out.println();
        }
    }
}
