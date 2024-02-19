package com.example.springdemo.config.handle;

import com.example.springdemo.controller.QuestionController;
import com.example.springdemo.domain.Answer;
import org.springframework.core.MethodParameter;
import org.springframework.http.MediaType;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.server.ServerHttpRequest;
import org.springframework.http.server.ServerHttpResponse;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseBodyAdvice;

/**
 * 拦截接口返回，并进行处理
 *
 * 应用场景：包装返回体，例如加入用户信息；修改返回结果，例如虚拟用户返回模拟数据；记录日志等
 */
@ControllerAdvice
public class CustomResponseBodyAdvice implements ResponseBodyAdvice<Answer> {

    @Override
    public boolean supports(MethodParameter returnType, Class<? extends HttpMessageConverter<?>> converterType) {
        System.out.println("In supports() method of " + getClass().getSimpleName());
        return returnType.getContainingClass() == QuestionController.class
                && returnType.getParameterType() == Answer.class;
    }

    @Override
    public Answer beforeBodyWrite(Answer answer, MethodParameter returnType, MediaType selectedContentType,
                                  Class<? extends HttpMessageConverter<?>> selectedConverterType, ServerHttpRequest request, ServerHttpResponse response) {
        System.out.println("In beforeBodyWrite() method of " + getClass().getSimpleName());

        answer.setAnswerMessage(answer.getAnswerMessage() + " by Spring");
        return answer;
    }
}
