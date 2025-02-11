package com.java;

public class Ternary_Operator_16 {
    public static void main(String[] args) {
        int income = 120_000;
       // String className = income >100_000
//        above is not possible becozz left is string and right is boolean expression
//                to reslove it we use ternary operator let see
        //Ternary operator here (? :) is ternary operator
        String className =  income > 100_000 ? "First" : "Economy" ;
        className = "First";
        System.out.println(className);
    }
}
