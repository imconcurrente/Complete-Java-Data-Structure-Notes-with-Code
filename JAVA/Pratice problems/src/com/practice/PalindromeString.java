package com.practice;

import java.util.Scanner;

public class PalindromeString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter A String");

        String str = scanner.next();
        String org_str = str;
        String  rev= "";
        int len = str.length();
        for (int i = len-1; i >=0; i--)
        {
            rev =rev+str.charAt(i);
        }
        if (org_str.equals (rev)){
            System.out.println(org_str+" Is Palindrome String");
        }
        else {
            System.out.println(org_str+" Is Not Palindrome String");
        }
    }
}
