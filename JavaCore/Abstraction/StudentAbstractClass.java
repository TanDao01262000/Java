package com.JavaCore.Abstraction;

abstract class StudentAbstractClass {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;
    abstract void greeting(String s);
    abstract void study();

}
