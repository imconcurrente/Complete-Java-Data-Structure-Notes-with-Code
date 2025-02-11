package com.practice;

public class ReverseString {
    public static void main(String[] args) {
        String name = "MEOW";
        String rev = "";
        int len = name.length();
        for (int i = len-1; i >=0; i--) {
             rev =rev+name.charAt(i);
        }
        System.out.println("Reversed String is:" + rev);
    }
}
