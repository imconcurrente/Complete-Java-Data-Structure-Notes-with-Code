package com.java.permutations;

import java.util.ArrayList;

public class Permutation {
    public static void main(String[] args) {
//         permutations("", "abc");

//        ArrayList<String> ans = permutationsList("", "abc");
//        System.out.println(ans);

        System.out.println(permutationsCount("", "abcd"));
    }

    //Q1:
    static void permutations(String p, String up){
        if (up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        for (int i = 0; i <= p.length() ; i++) {
            String first = p.substring(0, i);
            String second = p.substring(i, p.length());
            permutations(first + ch + second, up.substring(1));
        }
    }

    //Q2: Arraylist
    static ArrayList<String> permutationsList(String p, String up){
        if (up.isEmpty()){
            // local to this call
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;

        }
        char ch = up.charAt(0);
        ArrayList<String> ans = new ArrayList<>();

        for (int i = 0; i <= p.length() ; i++) {
            String first = p.substring(0, i);
            String second = p.substring(i, p.length());
           ans.addAll(permutationsList(first + ch + second, up.substring(1)));
        }
        return ans;
    }

    //Q3: count
    static int permutationsCount(String p, String up) {
        if (up.isEmpty()) {
            return 1;
        }
        int count = 0;
        char ch = up.charAt(0);
        for (int i = 0; i <= p.length(); i++) {

            String first = p.substring(0, i);
            String second = p.substring(i, p.length());
            count = count + permutationsCount(first + ch + second, up.substring(1));
        }
        return count;
    }
}
