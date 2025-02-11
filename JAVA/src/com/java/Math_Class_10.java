package com.java;

public class Math_Class_10 {
    public static void main(String[] args) {
//Math.round () it round off the decimal shown below
//    int result = Math.round(1.1F);

// ceil is another method which gives on return greater than the taken value and it return in double
//        int result = (int)Math.ceil(1.1F);

//another is floor where no. is smaller or equal to the no.
//        int result = (int) Math.floor(1.1F);

//another is max which returns greater of two values
//        int result = (int)Math.max(2,4);

//similar to max we've min
//but pretty useful method is random to generating a random value b/w 0 & 1
//let me show u
//          double result = Math.random();
//        System.out.println(result);//-->everytime after running program we get diff value b/w 0 to 1

//if i do want decimal in above case result than
//              double result = Math.round(Math.random()*100);
// if we want int
//             int result = (int)Math.round(Math.random()*100);
//similarly we can do this like this

             int result = (int)(Math.random()*100);
        System.out.println(result);
    }
 }