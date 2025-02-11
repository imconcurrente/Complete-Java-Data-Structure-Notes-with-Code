package com.java.staticExample;

public class Main {
    public static void main(String[] args) {
//        Human kunal = new Human(22, "Kunal", 10000, false);
//        Human vedant = new Human(22, "Vedant", 15000, true);
//        Human ishan = new Human(22, "Ishan", 25000, true);
//
////        System.out.println(kunal.name);
//        System.out.println(Human.population);
//        System.out.println(Human.population);
//        System.out.println(Human.population);

        Main funn =new Main();
        funn.fun2();

    }
    // this is not dependent on objects
    // this does not belong to an instance
    static void fun(){
//        greeting();  // you can't use this because it requires an instance
        // but the function you are using it in does not depend on instances

        // To solve the error problem there is a way like this!
       // Note: you cannot access non-static stuff without referencing their instances in a static context

        // hence, here I am referencing it
        Main obj = new Main();
        obj.greeting();

    }

    void fun2(){
        greeting();
    }

    // we know that something which is not static, belongs to an object
    // this belongs to an instance
    void greeting(){
//        fun();
        System.out.println("Hello World");
    }
}
