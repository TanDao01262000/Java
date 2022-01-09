package com.AdvancedJava.Multithreading;

public class Thread1 extends Thread{   // First way to create a thread

    @Override
    public void run(){
        try{
            System.out.println("Thread1 is running");
        }catch (Exception e){
            System.out.println("Exception: " + e);
        }
    }


}
