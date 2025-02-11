package com.java.strings;

public class Stream {
    public static void main(String[] args) {
        skip("", "baccdah ");
        System.out.println(skip("baccdah "));
        System.out.println(skipApple("bdcapplecdah"));
        System.out.println(skipNotApple("bdcapplcdah"));
    }
//Q1:
// method : 1
    static void skip(String p, String up){
        if (up.isEmpty()){
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0);

        if (ch == 'a'){
            skip(p, up.substring(1));
        }else {
            skip(p + ch, up.substring(1));
        }
    }

// method : 2
    static String skip(String up){
        if (up.isEmpty()){
            return "";
        }

        char ch = up.charAt(0);

        if (ch == 'a'){
            return skip(up.substring(1));
        }else {
           return ch + skip(up.substring(1));
        }
    }
//Q2:
    static String skipApple(String up){
        if (up.isEmpty()){
            return "";
        }
        if (up.startsWith("apple")){
            return skipApple(up.substring(5));
        }else {
            return up.charAt(0) + skipApple(up.substring(1));
        }
    }

//Q3:
    static String skipNotApple(String up){
        if (up.isEmpty()){
            return "";
        }
        if (up.startsWith("app") && !up.startsWith("apple")){
            return skipNotApple(up.substring(3));
        }else {
            return up.charAt(0) + skipNotApple(up.substring(1));
        }
    }
}
