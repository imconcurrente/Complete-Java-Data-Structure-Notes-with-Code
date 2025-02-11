package com.vedant;

import java.util.Arrays;

// When you create a method that takes the variable no. of arguments
//it is known as variable arguments(VarArgs)
public class VarArgs {
    public static void main(String[] args) {
      fun(2, 3, 4, 45, 67, 23, 86);
      fun();

      multiple(2,3,"Vedant", "Kunal");
    }

    static void multiple(int a, int b, String ...v){
        System.out.println(a);
        System.out.println(b);
        System.out.println(Arrays.toString(v));
    }


    static void fun(int ...v){
        System.out.println(Arrays.toString(v));
    }
}
