package com.practice;

import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");

        int num = scanner.nextInt();
        int org_num =num;

        int rev =0;
        while (num!=0){
            rev = rev*10 + num%10;
            num = num/10;
        }


        if (org_num==rev){
            System.out.println(org_num + " Palindrome Number");

        }
        else {
            System.out.println(org_num + " Not a Palindrome Number");
        }
    }
}
