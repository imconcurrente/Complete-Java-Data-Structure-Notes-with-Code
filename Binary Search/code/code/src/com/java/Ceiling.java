package com.java;
// ceiling : smallest number greater than equal to target
public class Ceiling {
    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 9, 14, 16, 18};
        int target = 15;
        int ans = ceiling(arr, target);
        System.out.println(ans);
    }

    // return the index of smallest no. >= target
    static int ceiling(int[] arr, int target){

        // But what if the target element is greater than the greatest number in the array
        if (target > arr[arr.length-1]){
            return -1;
        }
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
        return start;
    }
}
