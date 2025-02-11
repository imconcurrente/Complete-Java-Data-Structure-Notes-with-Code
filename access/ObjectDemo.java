package com.java.access;

public class ObjectDemo {
    int num;


    public ObjectDemo(int num) {
        this.num = num;
    }

    // already covered these 2 : toString and finalize
    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
    }

    // we will go in details of how to create it in hashmap lecture
    @Override
    public int hashCode() {
        return super.hashCode();
//        return num; // if u want 34 as output nhi toh upar random values toh dega hi
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public static void main(String[] args) {
        ObjectDemo obj = new ObjectDemo(34);
        ObjectDemo obj1 = obj; // to get same random value as obj
        ObjectDemo obj2 = new ObjectDemo(34);
//        System.out.println(obj.hashCode());
//        System.out.println(obj2.hashCode());


        // getClass() can be use to get data and getClass(). contains many methods just
        // try to use it the list will appear like i did getName()
        System.out.println(obj1.getClass().getName());
    }

}
