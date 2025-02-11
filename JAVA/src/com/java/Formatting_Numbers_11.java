package com.java;

import java.text.NumberFormat;

//public class Formatting_Numbers_11 {
//    public static void main(String[] args) {
////        // $1,234,567
////        // 10%
//        NumberFormat currency = NumberFormat.getCurrencyInstance();
//        String result = currency.format(1234567.891);
//        System.out.println(result);
//    }
//}
////        If you want in percent like 10% then use just
////                rename currency to percent
////other method for currency, percent is method chaining i'm showing for percent
public class Formatting_Numbers_11 {
    public static void main(String[] args) {
        String result =NumberFormat.getPercentInstance().format(0.1);
        System.out.println(result);
        //same for currency!
    }
}





