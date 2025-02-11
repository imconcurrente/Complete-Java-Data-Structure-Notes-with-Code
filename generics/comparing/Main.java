package com.java.generics.comparing;

import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Student kunal = new Student(12, 85.62f);
        Student ishan = new Student(32, 99.45f);
        Student vedant = new Student(45, 95.45f);
        Student aryan = new Student(25, 77.45f);
        Student jayant = new Student(19, 96.8f);

        Student[] list = {kunal, ishan, vedant, aryan, jayant};

        System.out.println(Arrays.toString(list));
        Arrays.sort(list, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return (int)(o1.marks - o2.marks); // ascending order
//                return -(int)(o1.marks - o2.marks); // descending order

            }
        });

        // lambda expression
        Arrays.sort(list, (o1, o2) -> -(int)(o1.marks - o2.marks)); // descending order


        System.out.println(Arrays.toString(list));


//        if (kunal.compareTo(ishan) < 0){
//            System.out.println(kunal.compareTo(ishan));
//            System.out.println("Ishan has more marks");
//        }

    }
}
