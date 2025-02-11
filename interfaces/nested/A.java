package com.java.interfaces.nested;

public interface A {
    // nested interfaces
    public interface NestedInterface{
        boolean isOdd(int num);

    }
}

class B implements A.NestedInterface{

    @Override
    public boolean isOdd(int num) {
        return (num & 1) == 1;
    }
}

