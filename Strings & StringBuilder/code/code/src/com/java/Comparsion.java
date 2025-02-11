package com.java;

public class Comparsion {
    public static void main(String[] args) {
        String a = "Vedant";
        String b = "Vedant";
        String c = a;
//        System.out.println(c == a);

        // ==
//        System.out.println(a == b);

        String name1 = new String("Vedant");
        String name2 = new String("Vedant");

        System.out.println(name1 == name2);
// output will be false !

        System.out.println(name1.equals(name2));

        System.out.println(name1.charAt(2));
        //charAt is used in String for index finding!

    }
}
