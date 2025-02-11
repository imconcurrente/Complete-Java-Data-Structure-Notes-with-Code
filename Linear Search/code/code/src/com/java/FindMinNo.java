package com.java;
//samjh nhi aaya
public class FindMinNo {
    public static void main(String[] args) {
       int[] arr = {18, 12, -7, 3, 14, 28};
        System.out.println(min(arr));
//        System.out.println("The min number in the array: " + min(arr) );
    }

    // assume arr.length != 0
     static int min(int [] arr){
        int ans = arr[0];
         for (int i = 0; i < arr.length ; i++) {
             if (arr[i] < ans){
                 ans = arr[i];
             }
         }
         return ans;
     }
}
