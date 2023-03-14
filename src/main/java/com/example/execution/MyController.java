package com.example.execution;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.CompletableFuture;

@RestController
public class MyController {
    private final MyService myService;

    public MyController(MyService myService) {
        this.myService = myService;
    }

    @GetMapping("/async")
    public CompletableFuture<String> doSomething() throws InterruptedException {
        return myService.doSomethingAsync();
    }

    
}

