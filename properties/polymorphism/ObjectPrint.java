package com.java.properties.polymorphism;

public class ObjectPrint {

    int num;
    public ObjectPrint(int num) {
        this.num = num;
    }

    // Don't ask me like that ObjectPrint do not extending so how does it overiding ?
    // By default, in java it is extending by default every class extends the object class
    @Override
    public String toString() {
        return "ObjectPrint{" +
                "num=" + num +
                '}';
    }

    public static void main(String[] args) {
        ObjectPrint obj = new ObjectPrint(54);

        System.out.println(obj); // if you do not put the overiding method in that it prints the default toString value

    }
}
