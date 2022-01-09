package com.AdvancedJava.Multithreading;

public class Thread2 implements Runnable{    // Another way to create a thread

    @Override
    public void run() {
        try{
            System.out.println("Thread2 is running");
        }catch (Exception e){
            System.out.println("Exception "+ e);

        }
    }


}
