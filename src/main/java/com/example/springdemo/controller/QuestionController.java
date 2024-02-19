package com.example.springdemo.controller;

import com.example.springdemo.domain.Answer;
import com.example.springdemo.domain.Question;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class QuestionController {

    @PostMapping("/ask")
    public Answer ask(@RequestBody Question question) {
        System.out.println("In controller method");

        Answer answer = new Answer();
        answer.setAnswerMessage("I don't know!");
        answer.setQuestion(question);
        return answer;
    }
}
