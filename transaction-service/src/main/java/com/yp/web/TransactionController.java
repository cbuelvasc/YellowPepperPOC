package com.yp.web;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("transactions")
public class TransactionController {

    @GetMapping
    public String getGreeting() {
        return "Welcome to the transaction service.";
    }

    @PostMapping("{name}")
    public String createGreeting(@PathVariable String name) {
        return String.format("Welcome to the transaction service %s.", name);
    }
}
