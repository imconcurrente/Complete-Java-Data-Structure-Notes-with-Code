package com.java;

public class Rough {
    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 7, 6, 4, 1};
        int target = 7;
        System.out.println(search(arr, target));
    }
    static int search(int[] arr, int target){
        int start = 0;
        int end = arr.length -1;


        while (start <= end){
            // find the middle element
//            int mid = (start + end)/ 2; // might be possible that (start + end) exceeds the range of int in java
            // so better way to find mid:
            int mid = start + (end - start) / 2;

            if (target < arr[mid]){
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            }else {
                // ans found
                return mid;
            }
        }
        return -1;
    }
}