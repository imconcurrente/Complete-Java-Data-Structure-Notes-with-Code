package com.java;
// Very important!
public class Max {
    public static void main(String[] args) {
        int[] arr = {1, 21, 3, 45, 9, 18, 76};
        System.out.println(maxRange(arr, 1, 4 ));
        System.out.println(max(arr));
    }
    // To find the max. value in a range
    // work on edge cases here, like array being null
    static int maxRange(int[] arr, int start, int end ) {

        if (end > start){
            return -1;
        }

        if (arr == null){
            return -1;
        }

        int maxValue = arr[start];
        for (int i = start; i <= end ; i++) {
            if (arr[i] > maxValue){
                maxValue = arr[i];
            }
        }
        return maxValue;
    }

    // To find the max. value
    static int max(int[] arr) {
        if (arr.length == 0){
            return -1;
        }
        int maxValue = arr[0];  // imagine that arr is not empty
        for (int i = 0; i < arr.length ; i++) {
            if (arr[i] > maxValue){
                maxValue = arr[i];
            }
        }
        return maxValue;
    }
}
