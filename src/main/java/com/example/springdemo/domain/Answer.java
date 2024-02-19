package com.example.springdemo.domain;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;

@Data
public class Answer {
    private String answerMessage;
    private Question question;
    @Value("${server.port}")
    private String port;
}
