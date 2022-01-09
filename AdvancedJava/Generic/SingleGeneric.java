package com.AdvancedJava.Generic;

public class SingleGeneric<T> {
    T obj;
    public SingleGeneric(T obj){
        this.obj = obj;

    }

    public T getObj() {
        return this.obj;
    }

    public void print(){
        System.out.println("This can be executed by object " + getObj());
    }

    public static void main(String[] args){
        SingleGeneric<Integer> intObj = new SingleGeneric<>(10);
        SingleGeneric<String> strObj = new SingleGeneric<>("Hello");
        intObj.print();
        strObj.print();
    }
}
