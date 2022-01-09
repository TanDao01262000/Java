package com.AdvancedJava.ConcurrencyUltilities;

import java.util.concurrent.*;

public class FutureClass {
    public static void main(String[] args) throws ExecutionException, InterruptedException, TimeoutException {

        ExecutorService executorService = Executors.newSingleThreadExecutor();

        Future<String> future = executorService.submit(() -> {

            try {
                Thread.sleep(10000);

            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            return "Completed";


        });     

        try {
            while (!future.isDone()){
                System.out.println("Loading...");
                Thread.sleep(500);
            }

        String res = future.get(3000, TimeUnit.MILLISECONDS);
        System.out.println(res);
        executorService.shutdown();

        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            future.cancel(true);
            future.isDone();
            future.isCancelled();

        }

    }
}
