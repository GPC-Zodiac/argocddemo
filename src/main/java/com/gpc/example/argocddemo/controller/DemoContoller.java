package com.gpc.example.argocddemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoContoller {

    @GetMapping("/hello")
    public String greetMe(){
        return "hello deepak, we are running argocd";
    }
}
