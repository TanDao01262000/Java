package com.AdvancedJava.Synchronization;

public class Thread2 implements Runnable{

    Multiple mul;

    public Thread2(Multiple mul){
        this.mul = mul;
    }

    @Override
    public void run() {
        try {
            mul.multiple(9);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
