package com.java.properties.polymorphism;

public class Numbers {
// example of method overloading  same name: sum but different arguments!
    int sum(int a, int b){
        return a + b;
    }

    int sum(int a, int b, int c ){
        return a + b;
    }

    public static void main(String[] args) {
        Numbers obj = new Numbers();
        obj.sum(2, 4);
        obj.sum(1, 3, 7);

//         obj.sum(4, 5, 6, 7);
    }
}
