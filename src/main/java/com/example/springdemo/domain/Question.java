package com.example.springdemo.domain;

import lombok.Data;

import java.util.Date;

@Data
public class Question {
    private String questionMessage;
    private Date date;
}
