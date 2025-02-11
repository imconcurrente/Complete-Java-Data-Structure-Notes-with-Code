package com.java;

public class DuplicateRotatedBS {
    public static void main(String[] args) {
        int[] arr = {2, 2, 2, 9, 2, 2};
        System.out.println(findPivotWithDulpticates(arr));
    }

    static  int search(int[] nums, int target) {
        int pivot = findPivotWithDulpticates(nums);
        // if you did not find a pivot, it means the array is rotated
        if (pivot == -1) {
            // just do normal binary search
            return binarySearch(nums, target, 0, nums.length - 1);
        }

        // if pivot is found, you have found 2 asc sorted arrays

        if (nums[pivot] == target) {
            return pivot;
        }

        if (target >= nums[0]) {
            return binarySearch(nums, target, 0, pivot - 1);
        }

        return binarySearch(nums, target, pivot + 1, nums.length - 1);

    }

static int binarySearch(int[] arr, int target, int start, int end) {
    while (start <= end) {
        // find the middle element
//            int mid = (start + end)/ 2; // might be possible that (start + end) exceeds the range of int in java
        // so better way to find mid:
        int mid = start + (end - start) / 2;

        if (target < arr[mid]) {
            end = mid - 1;
        } else if (target > arr[mid]) {
            start = mid + 1;
        } else {
            // ans found
            return mid;
        }
    }
    return -1;
}
    static int findPivotWithDulpticates(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            // 4 cases over here
            if (mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            }
            //if element at middle, start, end are equal then just skip the duplicates
            if (arr[mid] == arr[start] && arr[mid] == arr[end]) {
                //skip the duplicates

                //NOTE: what if these elements at start and end were the pivot?
                //check if start is pivot

                if (arr[start] > arr[start + 1]) {
                    return start;
                }
                start++;


                //check whether end is pivot
                if (arr[end] < arr[end - 1]) {
                    return end - 1;
                }
                end--;
            }
            //left side is sorted, so pivot should be in right
            else if (arr[start] < arr[mid] || (arr[start] == arr[mid] & arr[mid] > arr[end])) {
                start = mid + 1;
            }else {
                end = mid -1;
            }

        }
        return -1;
    }

}

