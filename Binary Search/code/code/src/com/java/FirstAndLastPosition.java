package com.java;

import java.util.Arrays;

// I'm having the doubt!
public class FirstAndLastPosition {
    public static void main(String[] args) {

        int[] nums = {5,7,7,8,8,10};
        int target = 8;
        System.out.println(Arrays.toString(searchRange(nums, 8)));
    }
    static int[] searchRange(int[] nums, int target){

        int[] ans = {-1, -1};
        // check for first occurrence if target first
        int start = search(nums, target, true);
        int end = search(nums, target, false);
        ans[0] = start;
        ans[1] = end;

        return ans;
    }

    // this function just returns the index value of target
    static int search(int[] nums, int target, boolean findStartIndex){
        int ans = -1;
        int start = 0;
        int end = nums.length -1;
        while (start <= end){
            // find the middle element
//            int mid = (start + end)/ 2; // might be possible that (start + end) exceeds the range of int in java
            // so better way to find mid:
            int mid = start + (end - start) / 2;

            if (target < nums[mid]){
                end = mid - 1;
            } else if (target > nums[mid]) {
                start = mid + 1;
            }else {
                // potential ans found
                ans = mid;
                if (findStartIndex){
                    end = mid - 1;
                }else {
                    start = mid + 1;
                }
            }
        }
        return ans;
    }
}
