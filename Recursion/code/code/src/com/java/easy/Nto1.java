package com.java.easy;

    // N to 1:
public class Nto1 {
    public static void main(String[] args) {
//         fun(5);
//         funRev(5);
        funBoth(5);
    }
    static void fun(int n){
        if (n == 0){
            return;
        }
        System.out.println(n);
        fun(n-1);
    }

    // 1 TO N:
    static void funRev(int n){
        if (n == 0){
            return;
        }
        funRev(n-1);
        System.out.println(n);
    }
       // Both N to 1 and 1 to N:
        static void funBoth(int n){
            if (n == 0){
                return;
            }
            System.out.println(n);
            funBoth(n-1);
            System.out.println(n);
        }
}
