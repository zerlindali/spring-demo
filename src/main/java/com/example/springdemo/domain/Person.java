package com.example.springdemo.domain;

public class Person {

    public String say(String name) {
        System.out.println("Hello , " + name);
        return "Hello , " + name;
    }
}
