package com.AdvancedJava.Multithreading;

public class Main extends Thread{
    public static int count =0;

    @Override
    public void run(){
        count ++;
    }

    public static void main(String[] args) throws InterruptedException {
//       int n = 10;
//        for (int i = 0; i< n; i ++){
//
//            Thread1 thread1 = new Thread1();   // Initialize a thread created by extends Thread
//            thread1.start();
//
//            Thread thread2 = new Thread(new Thread2());  // Initialize a thread created by implements Runnable
//            thread2.start();
//        }

        Main thread = new Main();
        thread.start();
        while (thread.isAlive()){   // force the program to wait until the thread is done
            System.out.println("Waiting...");
        }

        System.out.println("Amount: " + count);
        count ++;
        System.out.println("Amount: " + count);




    }
}
