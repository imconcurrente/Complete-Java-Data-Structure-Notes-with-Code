package com.java;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
       LL list = new LL();
       list.insertFirst(3);
       list.insertFirst(5);
       list.insertFirst(9);
       list.insertFirst(2);
       list.insertFirst(7);
       list.insertLast(17);

       list.insert(100, 3);

       list.display();
       System.out.println(list.deleteFirst());

       list.display();

       System.out.println(list.deleteLast());
       list.display();

       System.out.println(list.deleteParticularIndex(2));
       list.display();


       list.insertRec(55, 2);
       list.display();




    }
}
