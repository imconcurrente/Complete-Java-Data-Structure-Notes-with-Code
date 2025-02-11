package com.java;

import java.util.ArrayList;

public class Operators {
    public static void main(String[] args) {
        System.out.println('a' + 'b');
        System.out.println("a" + "b");
        System.out.println((char)( 'a' + 3));

        System.out.println("a" + 1);
        // this is same as after a few steps: "a" + "1"
        //integer will be converted to Integer that will call toSTRING()

        System.out.println("Vedant" + new ArrayList<>());
        System.out.println("Vedant" + new Integer(56));
        String ans = new Integer(56) + "" + new ArrayList<>();
        // + operator only works for primitives!
        System.out.println(ans);

    }
}
