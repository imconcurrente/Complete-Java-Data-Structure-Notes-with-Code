package com.java;

import java.util.Arrays;

//Arrays are reference type
//Arrays are fixed length
public class Arrays_05 {
    public static void main(String[] args) {
        int[] numbers ={11,2,5,7,10};
       Arrays.sort(numbers);
   // Arrays.sort(); ---> It just sort the order of numbers

        System.out.println(Arrays.toString(numbers));
    }
}
