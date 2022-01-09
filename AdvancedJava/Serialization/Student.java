package com.AdvancedJava.Serialization;

import java.io.Serial;
import java.io.Serializable;

public class Student implements Serializable {

    @Serial
    private static final long serialVersionUID  = 1L; // keep tracking for the serialization version

    private String name;
    private int age;
    private String address;

    transient int x; // "transient" key is used to set any properties of a class that you do not want to serialize

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }



    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Student(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    @Override
    public String toString(){
        return ("Student name is " + this.getName()+ ", age is " + this.getAge()
                +" and address is: "+ this.getAddress());
    }


}
