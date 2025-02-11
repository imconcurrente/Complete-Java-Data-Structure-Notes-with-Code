package com.java.arrays;

public class Sorted {
    public static void main(String[] args) {
     int[] arr = { 1, 2, 3, 5, 8};
        System.out.println(sorted(arr, 0));
    }

    static boolean sorted (int[] arr, int index){
        // base condition : if you are at the last index return true
        if (index == arr.length -  1){
            return true;
        }
           return  arr[index] < arr[index + 1] && sorted( arr, index + 1);
    }
}
