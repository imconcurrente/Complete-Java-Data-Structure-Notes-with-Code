package com.java;

public class Main3 {
    public static void main(String[] args) {
        CLL list = new CLL();
        list.insert(12);
        list.insert(37);
        list.insert(23);
        list.insert(56);
        list.insert(77);
        list.display();


        list.delete(23);
        list.display();
    }
}
