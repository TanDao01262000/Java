package com.AdvancedJava.Synchronization;

public class Main {
    public static void main(String[] args){
        Multiple mul = new Multiple();
        Thread1 thread1 = new Thread1(mul);
        Thread thread2 = new Thread(new Thread2(mul));

        thread1.start();
        thread2.start();

    }
}
