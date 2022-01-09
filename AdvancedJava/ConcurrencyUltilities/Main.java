package com.AdvancedJava.ConcurrencyUltilities;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {

    public static void main(String[] args){
        executorInvoke();
    }

    private static void executorInvoke() {
        Executor  executor = new Caller();
        executor.execute(() -> {
            System.out.println("Executor sample");
        });
    }

    private static void executorServiceInvoke(){
        ExecutorService executorService = Executors.newFixedThreadPool(7);
        executorService.submit(() ->
                System.out.println("ExecutorService Sample"));
    }

}