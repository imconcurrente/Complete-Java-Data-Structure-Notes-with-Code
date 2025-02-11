package com.java;

public class Main2 {
    public static void main(String[] args) {
        DLL list = new DLL();
        list.insertFirst(3);
        list.insertFirst(5);
        list.insertFirst(8);
        list.insertFirst(13);

        list.insertLast(27);

        list.insert(5, 16);

        list.display();
    }
}
