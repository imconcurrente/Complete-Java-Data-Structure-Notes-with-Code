package com.practice;

import java.util.Random;

public class GenerateRandomNumberAndStrings {
    public static void main(String[] args) {
         //Approach 1 -random
        Random rand = new Random();

        int rand_int = rand.nextInt(100);
        System.out.println(rand_int);

        double rand_dbl = rand.nextDouble();
        System.out.println(rand_dbl);




        //Approach 2 -Math
        Math.random();
        System.out.println(Math.random());

    }
}
