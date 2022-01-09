package com.AdvancedJava.Generic;

import java.util.Arrays;

public class DualGeneric<T, M> {
    T object;
    M object1;

    public DualGeneric(T object, M object1) {
        this.object = object;
        this.object1 = object1;

    }

    public void print() {
        System.out.println("This is a dual generic example of " + this.object + " and " + object1);
    }

    public static void main(String[] args) {
        DualGeneric<Integer, String> dual = new DualGeneric<>(7, "Hello");
        dual.print();

    }
}
