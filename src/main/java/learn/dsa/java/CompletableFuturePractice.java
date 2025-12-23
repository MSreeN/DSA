package learn.dsa.java;

import org.apache.logging.log4j.Logger;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class CompletableFuturePractice {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        completableFutureMethod().get();
        boolean s = completableFutureMethod().isCompletedExceptionally();
        System.out.println(s);
    }

    public void methodThatCallsCompletableFutureMethod(){}

    public static CompletableFuture<String> completableFutureMethod(){
        CompletableFuture<String> future = new CompletableFuture<>();
        future.completeAsync(CompletableFuturePractice::throwException);
        return future;
//        CompletableFuture<String> future = CompletableFuture.runAsync(() -> throwException());
    }

    public static String throwException(){
        throw new RuntimeException("Custom exception");
    }
}
