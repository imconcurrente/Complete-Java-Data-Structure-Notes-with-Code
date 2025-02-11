package com.java.googleAmazonQuestion;

import java.util.ArrayList;

public class PhoneNumber {
    public static void main(String[] args) {
       letters("", "12");

        System.out.println(lettersRet("", "12"));
        System.out.println(lettersRet("", "12").size()); // for count or size

        System.out.println(lettersCount("", "12"));
    }
//Q: Letter combinations of a phone number
    static void letters(String p, String up){
        if (up.isEmpty()){
            System.out.println(p);
            return;
        }

        int digit = up.charAt(0) - '0'; // this will convert '2' into 2
        for (int i = (digit - 1) * 3; i < digit * 3 ; i++) {  // digit range
            char ch = (char)('a' + i);
            letters(p + ch, up.substring(1));

        }
    }

//Q: Via Arraylist
    static ArrayList<String> lettersRet(String p, String up ){
        if (up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        int digit = up.charAt(0) - '0'; // this will convert '2' into 2
        ArrayList<String> list = new ArrayList<>();

        for (int i = (digit - 1) * 3; i < digit * 3 ; i++) {  // digit range
            char ch = (char)('a' + i);
            list.addAll(lettersRet(p + ch, up.substring(1)));

        }
        return list;
    }

//Q: count
    static int lettersCount(String p, String up){
        if (up.isEmpty()){
            return 1;
        }
        int count = 0;
        int digit = up.charAt(0) - '0'; // this will convert '2' into 2
        for (int i = (digit - 1) * 3; i < digit * 3 ; i++) {  // digit range
            char ch = (char) ('a' + i);
           count = count + lettersCount(p + ch, up.substring(1));
        }
        return count;
    }
}
