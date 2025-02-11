package com.practice;

public class CountNumberOfDigits {
    public static void main(String[] args) {
        int num = 123456789;
        int count = 0;
//By while loop

        while (num>0){
           num = num/10;
           count++;
        }
        System.out.println(" Number of Digits " + count);

// By for loop
        int i;
        for (i = 0; num >0; i++) {
            num = num/10;
            count++;
        }
        System.out.println("Number of Digits " + count);
    }
}



