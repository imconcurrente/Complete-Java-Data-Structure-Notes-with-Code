package com.java.staticExample;

public class Human {
        int age;
        String name;
        int salary;
        boolean married;
        static long population; // used static because it will be common for all objects

    static void message(){
        System.out.println("Hello World");
//        System.out.println(this.age); // obvious error we've got because inside static function
        // you can't use this because static does not belong to objects same story given for fun and greeting
    }

        public Human(int age, String name, int salary, boolean married){
            this.age = age;
            this.name = name;
            this.salary = salary;
            this.married = married;
            Human.population += 1;  // u can use this as well but by convection use class name.variable

    }
}
