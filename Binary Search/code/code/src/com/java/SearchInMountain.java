package com.java;

public class SearchInMountain {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 3, 1};
        int target = 3;
        System.out.println(search(arr, target));

    }
    static int search(int[] arr, int target){
        int peak = peakIndexMountainArray(arr);
        int firstTry = orderAgnosticsBS(arr, target,0, peak);
        if (firstTry != -1){
          return  firstTry;
        }
        // try to search in second half
        return orderAgnosticsBS(arr, target, peak+1, arr.length-1);
    }

    static int peakIndexMountainArray(int[] arr){
        int start = 0;
        int end = arr.length-1;

        while (start< end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > arr[mid + 1]) {
                //you are in dec part of an array
                //this may be the ans, but look at left
                //this is why end! = mid - 1
                end = mid;
            } else {
                // you are in inc part of an array
                start = mid + 1; // becozz we know that mid + 1 element > mid element
            }
        }
        // in the end, start == end and pointing to the largest number because of the 2 checks above
        // start and end are always trying to find max element in the above 2 checks
        //hence, when they are pointing to just one element, that is the max one because that is what the checks says
        // more elaboration: at every point of time for start and end, they have the best possible answer till that time
        // and if we are saying that only item is remaining, hence cuz of above line that is the best possible ans

        return start; // or return end as both are equal

            }

            static int orderAgnosticsBS ( int[] arr, int target, int start, int end){
                // find whether the array is sorted in ascending or descending
                boolean isAsc = arr[start] < arr[end];

                while (start <= end) {
                    // find the middle element
//            int mid = (start + end)/ 2; // might be possible that (start + end) exceeds the range of int in java
                    // so better way to find mid:
                    int mid = start + (end - start) / 2;

                    if (arr[mid] == target) {
                        return mid;
                    }

                    if (isAsc) {
                        if (target < arr[mid]) {
                            end = mid - 1;
                        } else {
                            start = mid + 1;
                        }
                    } else {
                        if (target > arr[mid]) {
                            end = mid - 1;
                        } else if (target < arr[mid]) {
                            start = mid + 1;
                        }

                    }
                }
                return -1;
            }
        }