package com.java;

public class Main {
    public static void main(String[] args) {
        int[] nums = {23, 45, 6, 87, 90, 54, -16, -11, 35};
        int target = 90;
        int ans = linearSearch(nums, target);
        System.out.println(ans);
    }

//Case III:    // search the target and return true or false
    static boolean linearSearch3(int[] arr, int target) {
        if (arr.length == 0) {
            return false ;
        }

        //run a for loop
        for (int element : arr) {
            if (element == target) {
                return true;
            }
        }

        //this line will execute if none of the return statements above have executed
        // hence the target not found
        return false;
    }



//Case II:    // search the target and return the element
    static int linearSearch2(int[] arr, int target) {
        if (arr.length == 0) {
            return -1;
        }

        //run a for loop
        // enhanced for loop:
        for (int element : arr) {
            if (element == target) {
                return element;
            }
        }

        //this line will execute if none of the return statements above have executed
        // hence the target not found
        return -1;
    }


 //Case I:   //search in the array: return the index if item found
    //otherwise if item not found return -1
    static int linearSearch(int[] arr, int target) {
        if (arr.length == 0) {
            return -1;
        }

        //run a for loop
        for (int index = 0; index < arr.length; index++) {
            //check for element at every index if it is = target
            int element = arr[index];
            if (element == target) {
                return index;
            }
        }

        //this line will execute if none of the return statements above have executed
        // hence the target not found
        return -1;
    }
}


