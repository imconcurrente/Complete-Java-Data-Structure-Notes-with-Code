package com.practice;

import java.util.Scanner;

         //By normal method


//public class PrimeNumber {
//    public static void main(String[] args) {
//
//        int num =10;
//        int count = 0;
//
//        if (num>1)
//        {
//
//            for (int i = 1; i <num ; i++) {
//                if (num%1==0)
//                    count++;
//            }
//            if (count==2)
//            {
//                System.out.println("Prime Number");
//            }
//            else
//            {
//                System.out.println("Not Prime Number");
//            }
//        }
//        else {
//            System.out.println("Not Prime Number");
//        }
//    }
//}

       //By Scanner Class method

public class PrimeNumber{
    public static void main(String[] args) {
        int num,count=0;
        System.out.println("Enter any Number: ");
        Scanner scanner = new Scanner(System.in);
        num = scanner.nextInt();


        for (int i = 1; i < num; i++) {
            if (num%1==0)
            {
                count++;
            }
        }
        if (count==2)
        {
            System.out.println("Prime Number" );
        }
        else {
            System.out.println("Not Prime Number");
        }
    }
}