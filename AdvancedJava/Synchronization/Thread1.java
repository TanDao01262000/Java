package com.AdvancedJava.Synchronization;

public class Thread1 extends Thread{
    Multiple mul;

    public Thread1(Multiple mul){
        this.mul = mul;
    }
    @Override
    public void run(){
        try {
            mul.multiple(2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
