package com.java;

import java.util.Arrays;
import java.util.Scanner;

public class MultiDimension {
    public static void main(String[] args) {
        /*
        1 2 3
        4 5 6
        7 8 9
         */
        Scanner scanner = new Scanner(System.in);

//        int [] [] arr2D = new int[3][];
//             // or
//        int [] [] arr = {
//                {1, 2, 3}, // 0th index
//                {4, 5, 6}, // 1st index
//                {6, 7, 8}  // 2nd index
        //individual arrays size is also varies  like this or anything
//                {1, 2, 3},
//                {4, 5},
//                {6, 7, 8}
//        };

        int[][] arr = new int[3][3];
        System.out.println(arr.length);

        // input
        for (int row = 0; row < arr.length; row++) {
            // for each col in every row
            for (int col = 0; col < arr[row].length; col++) {
                arr[row][col] = scanner.nextInt();
            }
        }

        //output
//        for (int row = 0; row < arr.length; row++) {
//            // for each col in every row
//            for (int col = 0; col < arr[row].length; col++) {
//                System.out.print(arr[row][col] + " ");
//            }
//            System.out.println();
//        }

        //or print with to string method:
//        for (int row = 0; row < arr.length; row++){
//            System.out.println(Arrays.toString(arr[row]));
//        }

        // or by enhanced for loop:
        for (int[] a: arr){
            System.out.println(Arrays.toString(a));
        }
    }
}

