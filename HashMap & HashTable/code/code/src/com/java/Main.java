package com.java;

import java.util.HashMap;
import java.util.HashSet;
import java.util.TreeMap;
//https://docs.oracle.com/javase/8/docs/api/java/util/Map.html
// check the different methods from the above link

public class Main {
    public static void main(String[] args) {
        // hashDemo();
//        MapUsingHash map = new MapUsingHash();

        HashMapFinal<String, String> map = new HashMapFinal<>();

        map.put("Mango", "King of fruits");
        map.put("Apple", "A sweet red fruit");
        map.put("Litchi", "Kunal's fav fruit");

        System.out.println(map.get("Apple"));
        System.out.println(map);


    }

    public static void hashDemo() {
        // String name = "Rahul";

        // Integer a = 4235678;

        // int code = a.hashCode();

        // System.out.println(code);





        //HASHMAP:
        HashMap<String, Integer>map = new HashMap<>();
        map.put("Kunal", 89);
        map.put("Karan", 99);
        map.put("Rahul", 94);

        System.out.println(map.get("Karan"));
//        System.out.println(map.getOrDefault("Aman", 78));
        System.out.println(map.containsKey("Kunal"));

        //TREEMAP:
        TreeMap<String, Integer> map1 = new TreeMap<>();
        map1.put("Kunal", 89);
        map1.put("Karan", 99);
        map1.put("Rahul", 94);

        System.out.println(map1.get("Rahul"));

        //HASHSET
        HashSet<Integer> set = new HashSet<>();
        set.add(56);
        set.add(9);
        set.add(12);
        set.add(43);
        set.add(56);
        set.add(2);

        System.out.println(set);

    }
}