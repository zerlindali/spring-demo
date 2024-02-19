package com.example.springdemo.domain;

import org.springframework.stereotype.Component;

@Component
public class SimpleBean {

    public void doA() {
        System.out.println("执行A方法.....");
    }
}
