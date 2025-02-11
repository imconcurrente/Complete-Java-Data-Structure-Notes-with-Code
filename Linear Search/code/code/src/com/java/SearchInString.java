package com.java;

import java.lang.reflect.Array;
import java.util.Arrays;

public class SearchInString {
    public static void main(String[] args) {
        String name = "Vedant";
         char target = 'd';
        System.out.println(search(name, target));

        System.out.println(Arrays.toString(name.toCharArray())); //converts the string into array
    }

    static boolean search2(String str, char target){
        if (str.length() == 0){
            return false;
        }
        // for-each loop or enhanced for loop:
        for (char ch : str.toCharArray()){
            if (ch == target){
                return true;
            }
        }
        return false;
    }


    static boolean search(String str, char target){
        if (str.length() == 0){
            return false;
        }
        for (int i = 0; i < str.length() ; i++) {
            if(target == str.charAt(i)){
                return true;
            }
        }
        return false;
    }
}
