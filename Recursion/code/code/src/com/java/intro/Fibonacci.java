package com.java.intro;

public class Fibonacci {
    public static void main(String[] args) {
//        int ans = fibo(4);
//        System.out.println(ans);

//        for (int i = 0; i < 11 ; i++) {
//            System.out.println(fiboFormula(i));
//        }

        System.out.println(fiboFormula(50));
    }

    // After studing time complexity I'm doing this
    static int fiboFormula(int n){
        // int is just for demo, use long instead!
        // this is nth fibonnaci formula
        return (int)( Math.pow(((1 + Math.sqrt(5)) / 2), n)/ Math.sqrt(5));
    }

    static int fibo(int n){

        //base condition
        if ( n < 2){
            return n;
        }

        return fibo(n-1) + fibo(n-2);
    }
}
