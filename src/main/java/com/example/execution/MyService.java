package com.example.execution;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import java.util.concurrent.CompletableFuture;

@Service
public class MyService {

    @Async
    public CompletableFuture<String> doSomethingAsync() throws InterruptedException {
        // Simulate some long-running task
        Thread.sleep(5000);
        return CompletableFuture.completedFuture("Async Task Completed!");
    }
}
