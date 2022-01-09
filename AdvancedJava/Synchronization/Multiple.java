package com.AdvancedJava.Synchronization;

public class Multiple {
    // "synchronized" keyword makes sure only one thread can use this method at a time.

//    synchronized void multiple(int n) throws InterruptedException {
//
//        for (int i = 1; i < 6; i ++){
//            System.out.println(n * i);
//            Thread.sleep(500);
//        }
//    }



    // Or we can use the synchronized block for parts that we want it to be synchronized
     void multiple(int n) throws InterruptedException {
        synchronized (this) {
            for (int i = 1; i < 6; i++) {
                System.out.println(n * i);
                Thread.sleep(500);
            }
        }
    }
}
