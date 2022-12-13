package com.example.webexam.controller;

import lombok.Data;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // 응답이 Data
public class JsonController {
    @GetMapping("/hello.json") // Hello클래스가 View의 역할.
    public Hello hello() {
        Hello hello = new Hello();
        hello.setMessage("Hello World!");
        hello.setCount(10);
        return hello;
    }
}

@Data
class Hello{
    private String message;
    private int count;
}
