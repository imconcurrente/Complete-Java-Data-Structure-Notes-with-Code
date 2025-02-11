package com.java;

public class For_EachLoop_22 {
    public static void main(String[] args) {
         String[] fruits = {"Apple", "Mango", "Orange"};

//Firstly I'm gonna use for loop to iterate over this array
//         for (int i = 0; i < fruits.length; i++)
//             System.out.println(fruits[i]);

//Now writing the same code using the for-each loop
        for (String fruit : fruits)  //--> now in each iteration fruit will hold the value of one item in this array
            //Now here we don't have to declare a numeric counter,boolean expression,
            //we don't have to write increment it's much easier
            System.out.println(fruit);
    }
}


//for-each loop limitations
//(1) It's always forward only so we cannot iterate over this array from end to the beginning
//In contrast we can do this with a (for loop) like this
//   for(int i =fruits.length; i > 0; i--)
//(2) we don't have access to the index of each item
//In contrast in our (for loops) we can access both the index and the actual item

