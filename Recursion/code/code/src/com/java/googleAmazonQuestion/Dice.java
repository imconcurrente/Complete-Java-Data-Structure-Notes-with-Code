package com.java.googleAmazonQuestion;

import java.util.ArrayList;

public class Dice {
    public static void main(String[] args) {
         dice("", 4);

        System.out.println(diceRet("", 4));

        System.out.println(diceCount("", 4));
        
    }

// Q: Number of dice rolls with target sum
    static void dice(String p, int target){
        if (target == 0){
            System.out.println(p);
            return;
        }

        for (int i = 1; i <= 6 && i <= target; i++) {
            dice(p + i, target - i);

        }
    }
//Q: via Arraylist
    static ArrayList<String> diceRet(String p, int target) {
        if (target == 0) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> list = new ArrayList<>();
        for (int i = 1; i <= 6 && i <= target; i++) {
            list.addAll(diceRet(p + i, target - i));
        }
           return list;
    }

//Q: count
    static int diceCount(String p, int target){
        if (target == 0){
            return 1;
        }

        int count = 0;
        for (int i = 1; i <= 6 && i <= target; i++) {
          count = count + diceCount(p + i, target - i);

        }
        return count;
    }

//Q: dice with custom number of faces
    static void diceFace(String p, int target, int face){
        if (target == 0){
            System.out.println(p);
            return;
        }

        for (int i = 1; i <= face && i <= target; i++) {
            diceFace(p + i, target - i, face);

        }
    }

//Q: dice Return ArrayList
    static ArrayList<String> diceFaceRet(String p, int target, int face) {
        if (target == 0) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> list = new ArrayList<>();
        for (int i = 1; i <= face && i <= target; i++) {
            list.addAll(diceFaceRet(p+i, target - i, face));
        }
        return list;
    }
}
