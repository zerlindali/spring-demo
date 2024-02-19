package com.example.springdemo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProfileController {

    @Value("${server.port}")
    private String port;

    @GetMapping("/welcome")
    public String welcome() {
        return "<h1 style='color: red; text-align: center'>欢迎访问Spring Boot世界~"+port+"</h1>";
    }
}
