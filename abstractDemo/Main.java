package com.java.abstractDemo;

public class Main {
    public static void main(String[] args) {
        Son son = new Son(30);
        son.career();

        son.normal();

//        Daughter daughter = new Daughter(27); // same of this u can write like this
        // by using Parent class as ref variable same thing u can do for son as well
        Parent daughter = new Daughter(27);
        daughter.career();

        Parent.hello();
//        Parent mom = new Parent(34); // error u can't create objects of an abstract class
        // also you can not create abstract constructor also
    }
}
