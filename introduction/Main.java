package com.java.introduction;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // store 5 roll nos
        int[] numbers = new int[5];

        // store 5 names
        String[] names = new String[5];

        // data of 5 students: {roll no, name, marks}
        int[] rno = new int[5];
        String[] name = new String[5];
        float[] marks = new float[5];

        // combined the roll no, name, marks in one datatype
        // this can be your own datatype & it is possible via classes

        Student[] students = new Student[5];

        // just declaring
//        Student kunal;
//        kunal = new Student();

      Student kunal = new Student(16, "Kunal Kushwaha", 85.5f);
      Student rahul = new Student();

//      kunal.rno = 13;
//      kunal.name = "Kunal Kushwaha";
//      kunal.marks = 88.5f;

//        kunal.changeName("Vedant");
//        kunal.greeting();


        System.out.println(kunal.rno);
        System.out.println(kunal.name);
        System.out.println(kunal.marks);

        Student random = new Student();
        System.out.println(random.name);

        Student one = new Student();
        Student two = one;

        one.name = "Something something";

        System.out.println(two.name);
    }
}

    // create a class
    // for every single student
    class Student {
        int rno;
        String name;
        float marks = 90;

        // we need a way to add the values of the above
        // properties object by object

        // we need one word to access ever object

        void greeting() {
            System.out.println("Hello My name is " + this.name);
        }

        void changeName(String name) {
            this.name = name;
        }

        Student() {
           //this is how you call a constructor from another constructor
            // internally : new Student (12, "default person", 100.0f);
            this(12, "default person", 100.0f );
        }

//        Student() {    // this is a constructor
//            // this keyword is nothing but just replacing it with name of the reference variable,
//            // which is kunal
//            this.rno = 13;
//            this.name = "Kunal Kushwaha";
//            this.marks = 88.5f;
//        }

        //if you are taking same variable name in class as well as in argument
        //then you need to add this keyword else it will remain unchanged!
        Student (int  rno, String name, float marks){
            this.rno = rno;
            this.name = name;
            this.marks = marks;
        }
    }

