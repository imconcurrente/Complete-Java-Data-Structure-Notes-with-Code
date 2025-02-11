package com.vedant;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {   //---> shortcut is psvm
//       int ans = sum2();//--->function call
//        System.out.println(ans);

        int ans = sum3(20, 30);
        System.out.println(ans);
    }
    //pass the value of numbers when you are calling the method in main()
    static int sum3(int a, int b){
        int sum = a + b;
        return sum;
    }




    // return the  value
    static int sum2() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number 1: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter the number 2: ");
        int num2 = scanner.nextInt();
        int sum = num1 + num2;
        return sum;  //---> From this the whole function gets end
    }



    static void sum(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number 1: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter the number 2: ");
        int num2 = scanner.nextInt();
        int sum =num1+num2;
        System.out.print("The sum : " + sum);
    }
    /*

    access modifier (we'll look in OOP)
       return_type name(arguments){
            //body
            return statement;
            }
     */
}


