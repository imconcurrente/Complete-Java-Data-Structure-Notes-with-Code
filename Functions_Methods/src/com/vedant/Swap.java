package com.vedant;

public class Swap {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        // swap numbers code
//        int temp = a;
//        a=b;
//        b=temp;

        swap(a, b);

        System.out.println("swap number: " +a + " " + b);

        String name = "Vedant Dixit";
        changeName(name);
        System.out.println(name);
    }

    static void changeName(String naam) {
        naam = "Kunal Kushwaha"; // creating a new object
    }

    static void swap(int num1, int num2){
        int temp = num1;
        num1=num2;
        num2=temp;

        // this change will only be valid in this function scope only.
    }
}
//Note -for primitive data types it is only going to do pass by value.
//for reference/object data types it is going to pass by value of that reference variable.