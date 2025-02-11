package com.java;
import java.text.DecimalFormat;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // constructor 1
        StringBuffer sb = new StringBuffer();
        System.out.println(sb.capacity());

        // constructor 2
        StringBuffer sb2 = new StringBuffer("Kunal Kushwaha");

        // constructor 3
        StringBuffer sb3 = new StringBuffer(30);
        System.out.println(sb3.capacity());

        sb.append("WeMakeDevs");
        sb.append(" is nice! ");

//        sb.insert(2, " Rahul ");
//        sb.replace(1, 5, "Kushwaha");
          sb.delete(1, 5);
//        sb.reverse();

        String str = sb.toString();
        System.out.println(sb);

        int n = 20;
        String name = RandomString.generate(n);
        System.out.println(name);


        // remove whitespace

        String sentence = "Hi h hjf  hvyds sjs wirid";
        System.out.println(sentence);

        System.out.println(sentence.replaceAll("\\s", ""));

        // split

        String arr = "Kunal Vedant Rahul Vivek";
        String[] names = arr.split(" ");
        System.out.println(Arrays.toString(names));

        // rounding off
        DecimalFormat df = new DecimalFormat("0.0000");
        System.out.println(df.format(7.6));


    }
}