package com.java;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

// count sort using array:
public class CountSort {
    public static void countSort(int[] array){
        if (array == null || array.length <=  1){
            return;
        }

        int max = array[0];
        for (int num: array){
            if (num > max){
                max = num;
            }
        }
        int[] countArray = new int[max + 1];
        for (int num: array){
            countArray[num]++;
        }
        int index = 0;
        for (int i = 0; i<= max; i++) {
            while (countArray[i] > 0) {
                array[index] = i;
                index++;
                countArray[i]--;
            }
        }
    }

    public static void countSortHash(int[] arr) {
        if (arr == null || arr.length <= 1) {
            return;
        }

        // Finding max and min values in the array
        int max = Arrays.stream(arr).max().getAsInt();
        int min = Arrays.stream(arr).min().getAsInt();

        // Create a HashMap for counting occurrences of each number
        Map<Integer, Integer> countMap = new HashMap<>();

        // Populate the countMap with the frequency of each element
        for (int num : arr) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }

        int index = 0;

        // Traverse the range from min to max to fill the array in sorted order
        for (int i = min; i <= max; i++) {
            int count = countMap.getOrDefault(i, 0); // Get count for each value
            for (int j = 0; j < count; j++) {
                arr[index] = i; // Fill array with sorted elements
                index++;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {6, 3, 10, 9, 2, 4, 9, 7};
//        countSort(arr);
        countSortHash(arr);
        System.out.println(Arrays.toString(arr));
    }
}
